package cn.hangruan.admin.security;

import cn.hangruan.admin.entity.Authority;
import cn.hangruan.admin.entity.SysUser;
import cn.hangruan.admin.service.SysUserService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 用于用户验证
 *
 * @author huyanchao
 * @Date 2018-04-16
 */
@Service
public class CustomUserDetailService implements UserDetailsService {

    @Resource
    private SysUserService userService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        SysUser user = new SysUser();
        user.setCode(userName);
        SysUser sysUser = userService.selectOne(new EntityWrapper<>(user).eq("code", userName));
        if (sysUser == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", userName));
        }
        return create(sysUser);
    }

    private UserDetails create(SysUser sysUser) {
        List<Authority> authorities = sysUser.getAuthorities() == null ? new ArrayList<>() : sysUser.getAuthorities();
        return new org.springframework.security.core.userdetails.User(sysUser.getCode(), sysUser.getPwd(), mapToGrantedAuthorities(authorities));

    }

    private Collection<? extends GrantedAuthority> mapToGrantedAuthorities(List<Authority> authorities) {
        return authorities.stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getName()))
                .collect(Collectors.toList());
    }
}
