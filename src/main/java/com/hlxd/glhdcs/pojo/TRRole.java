package com.hlxd.glhdcs.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * TRRole
 * 数据库表：T_R_ROLE 角色表
 */
public class TRRole implements Serializable {

    /**
     * 角色IUID
     * 表字段 : T_R_ROLE.IUID
     */
    private String iuid;

    /**
     * 角色名称
     * 表字段 : T_R_ROLE.ROLE_NAME
     */
    private String roleName;

    /**
     * 来源ID
     * 表字段 : T_R_ROLE.PARENTID
     */
    private String parentid;

    /**
     * 创建时间
     * 表字段 : T_R_ROLE.CREATE_DATE
     */
    private Date createDate;

    /**
     * 创建人
     * 表字段 : T_R_ROLE.ADD_OPER
     */
    private String addOper;

    /**
     * 更新时间
     * 表字段 : T_R_ROLE.UPDATE_DATE
     */
    private Date updateDate;

    /**
     * 更新人
     * 表字段 : T_R_ROLE.UPDATE_OPER
     */
    private String updateOper;

    /**
     * 是否有效
     * 表字段 : T_R_ROLE.IS_ENABLE
     */
    private Byte isEnable;

    /**
     * 序列号
     * 表字段 : T_R_ROLE.SEQ
     */
    private Integer seq;

    /**
     * 获取 角色IUID 字段:T_R_ROLE.IUID
     *
     * @return T_R_ROLE.IUID, 角色IUID
     */
    public String getIuid() {
        return iuid;
    }

    /**
     * 设置 角色IUID 字段:T_R_ROLE.IUID
     *
     * @param iuid the value for T_R_ROLE.IUID, 角色IUID
     */
    public void setIuid(String iuid) {
        this.iuid = iuid == null ? null : iuid.trim();
    }

    /**
     * 获取 角色名称 字段:T_R_ROLE.ROLE_NAME
     *
     * @return T_R_ROLE.ROLE_NAME, 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置 角色名称 字段:T_R_ROLE.ROLE_NAME
     *
     * @param roleName the value for T_R_ROLE.ROLE_NAME, 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * 获取 来源ID 字段:T_R_ROLE.PARENTID
     *
     * @return T_R_ROLE.PARENTID, 来源ID
     */
    public String getParentid() {
        return parentid;
    }

    /**
     * 设置 来源ID 字段:T_R_ROLE.PARENTID
     *
     * @param parentid the value for T_R_ROLE.PARENTID, 来源ID
     */
    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    /**
     * 获取 创建时间 字段:T_R_ROLE.CREATE_DATE
     *
     * @return T_R_ROLE.CREATE_DATE, 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置 创建时间 字段:T_R_ROLE.CREATE_DATE
     *
     * @param createDate the value for T_R_ROLE.CREATE_DATE, 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 创建人 字段:T_R_ROLE.ADD_OPER
     *
     * @return T_R_ROLE.ADD_OPER, 创建人
     */
    public String getAddOper() {
        return addOper;
    }

    /**
     * 设置 创建人 字段:T_R_ROLE.ADD_OPER
     *
     * @param addOper the value for T_R_ROLE.ADD_OPER, 创建人
     */
    public void setAddOper(String addOper) {
        this.addOper = addOper == null ? null : addOper.trim();
    }

    /**
     * 获取 更新时间 字段:T_R_ROLE.UPDATE_DATE
     *
     * @return T_R_ROLE.UPDATE_DATE, 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置 更新时间 字段:T_R_ROLE.UPDATE_DATE
     *
     * @param updateDate the value for T_R_ROLE.UPDATE_DATE, 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 更新人 字段:T_R_ROLE.UPDATE_OPER
     *
     * @return T_R_ROLE.UPDATE_OPER, 更新人
     */
    public String getUpdateOper() {
        return updateOper;
    }

    /**
     * 设置 更新人 字段:T_R_ROLE.UPDATE_OPER
     *
     * @param updateOper the value for T_R_ROLE.UPDATE_OPER, 更新人
     */
    public void setUpdateOper(String updateOper) {
        this.updateOper = updateOper == null ? null : updateOper.trim();
    }

    /**
     * 获取 是否有效 字段:T_R_ROLE.IS_ENABLE
     *
     * @return T_R_ROLE.IS_ENABLE, 是否有效
     */
    public Byte getIsEnable() {
        return isEnable;
    }

    /**
     * 设置 是否有效 字段:T_R_ROLE.IS_ENABLE
     *
     * @param isEnable the value for T_R_ROLE.IS_ENABLE, 是否有效
     */
    public void setIsEnable(Byte isEnable) {
        this.isEnable = isEnable;
    }

    /**
     * 获取 序列号 字段:T_R_ROLE.SEQ
     *
     * @return T_R_ROLE.SEQ, 序列号
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * 设置 序列号 字段:T_R_ROLE.SEQ
     *
     * @param seq the value for T_R_ROLE.SEQ, 序列号
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }
}