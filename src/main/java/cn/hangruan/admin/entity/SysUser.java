package cn.hangruan.admin.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * <p>
 * 系统_用户
 * </p>
 *
 * @author huyanchao
 * @since 2018-04-16
 */
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 编制机构id
     */
    private Long officialOrganId;
    /**
     * 编制科室id
     */
    private Long officialDepartId;
    /**
     * 现所在机构id
     */
    private Long organId;
    /**
     * 现所在科室id
     */
    private Long departId;
    /**
     * 编号登录帐号
     */
    private String code;
    /**
     * 姓名
     */
    private String name;
    /**
     * 密码
     */
    private String pwd;
    /**
     * 简码
     */
    private String shorthand;
    /**
     * 科室内排序号
     */
    private Integer sort;
    /**
     * 主角色id
     */
    private Long roleId;
    /**
     * 领导标识0非部门领导1主要领导2分管领导(枚举字典12类)
     */
    private Integer leaderFlag;
    /**
     * 编制类型：0编外1公务员2机关工人3事业编(枚举字典3类)
     */
    private Integer officialTypeId;
    /**
     * 岗位调动类型id(关联表arc_transfer_type)
     */
    private Integer transferTypeId;
    /**
     * 入职日期
     */
    private Date entryDate;
    /**
     * 离退日期
     */
    private Date retireDate;
    /**
     * 是否在职
     */
    private Integer isJob;
    /**
     * 是否考核
     */
    private Integer isAssess;
    /**
     * 是否停用
     */
    private Integer isDisabled;
    /**
     * 备注
     */
    private String memo;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 更新时间
     */
    private Date gmtModified;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOfficialOrganId() {
        return officialOrganId;
    }

    public void setOfficialOrganId(Long officialOrganId) {
        this.officialOrganId = officialOrganId;
    }

    public Long getOfficialDepartId() {
        return officialDepartId;
    }

    public void setOfficialDepartId(Long officialDepartId) {
        this.officialDepartId = officialDepartId;
    }

    public Long getOrganId() {
        return organId;
    }

    public void setOrganId(Long organId) {
        this.organId = organId;
    }

    public Long getDepartId() {
        return departId;
    }

    public void setDepartId(Long departId) {
        this.departId = departId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getShorthand() {
        return shorthand;
    }

    public void setShorthand(String shorthand) {
        this.shorthand = shorthand;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Integer getLeaderFlag() {
        return leaderFlag;
    }

    public void setLeaderFlag(Integer leaderFlag) {
        this.leaderFlag = leaderFlag;
    }

    public Integer getOfficialTypeId() {
        return officialTypeId;
    }

    public void setOfficialTypeId(Integer officialTypeId) {
        this.officialTypeId = officialTypeId;
    }

    public Integer getTransferTypeId() {
        return transferTypeId;
    }

    public void setTransferTypeId(Integer transferTypeId) {
        this.transferTypeId = transferTypeId;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getRetireDate() {
        return retireDate;
    }

    public void setRetireDate(Date retireDate) {
        this.retireDate = retireDate;
    }

    public Integer getIsJob() {
        return isJob;
    }

    public void setIsJob(Integer isJob) {
        this.isJob = isJob;
    }

    public Integer getIsAssess() {
        return isAssess;
    }

    public void setIsAssess(Integer isAssess) {
        this.isAssess = isAssess;
    }

    public Integer getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Integer isDisabled) {
        this.isDisabled = isDisabled;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return "SysUser{" +
        ", id=" + id +
        ", officialOrganId=" + officialOrganId +
        ", officialDepartId=" + officialDepartId +
        ", organId=" + organId +
        ", departId=" + departId +
        ", code=" + code +
        ", name=" + name +
        ", pwd=" + pwd +
        ", shorthand=" + shorthand +
        ", sort=" + sort +
        ", roleId=" + roleId +
        ", leaderFlag=" + leaderFlag +
        ", officialTypeId=" + officialTypeId +
        ", transferTypeId=" + transferTypeId +
        ", entryDate=" + entryDate +
        ", retireDate=" + retireDate +
        ", isJob=" + isJob +
        ", isAssess=" + isAssess +
        ", isDisabled=" + isDisabled +
        ", memo=" + memo +
        ", gmtCreate=" + gmtCreate +
        ", gmtModified=" + gmtModified +
        "}";
    }
}
