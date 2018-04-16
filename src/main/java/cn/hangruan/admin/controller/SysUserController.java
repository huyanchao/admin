package cn.hangruan.admin.controller;


import cn.hangruan.admin.bean.ResultMessage;
import cn.hangruan.admin.entity.SysUser;
import cn.hangruan.admin.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * <p>
 * 系统_用户 前端控制器
 * </p>
 *
 * @author huyanchao
 * @since 2018-04-16
 */
@Controller
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private SysUserService userService;

    @RequestMapping("")
    @ResponseBody
    public ResultMessage findUserById(Long id) {
        SysUser sysUser = userService.selectById(id);

        return new ResultMessage(500, "成功", sysUser);
    }
}

