package com.hlxd.glhdcs.pojo;

import java.util.Date;

/**
 * 替代方案表
 * TSSolution
 * 数据库表：T_S_SOLUTION
 */
public class TSSolution {

    /**
     * 替代方案编号(主键)
     * 表字段 : T_S_SOLUTION.SOLUTION_ID
     */
    private String solutionId;

    /**
     * 淘汰物资编码
     * 表字段 : T_S_SOLUTION.OBSOLETE_UNIT_CODE
     */
    private String obsoleteUnitCode;

    /**
     * 淘汰物资名称
     * 表字段 : T_S_SOLUTION.OBSOLETE_UNIT_NAME
     */
    private String obsoleteUnitName;

    /**
     * 淘汰物资型号
     * 表字段 : T_S_SOLUTION.OBSOLETE_UNIT_MODEL
     */
    private String obsoleteUnitModel;

    /**
     * 淘汰设备编码
     * 表字段 : T_S_SOLUTION.OBSOLETE_EQUIPMENT_CODE
     */
    private String obsoleteEquipmentCode;

    /**
     * 替代物资编码
     * 表字段 : T_S_SOLUTION.REPLACE_UNIT_CODE
     */
    private String replaceUnitCode;

    /**
     * 替代物资名称
     * 表字段 : T_S_SOLUTION.REPLACE_UNIT_NAME
     */
    private String replaceUnitName;

    /**
     * 替代物资型号
     * 表字段 : T_S_SOLUTION.REPLACE_UNIT_MODEL
     */
    private String replaceUnitModel;

    /**
     * 替代建议
     * 表字段 : T_S_SOLUTION.REPLACE_SUGGEST
     */
    private String replaceSuggest;

    /**
     * 客户反馈
     * 表字段 : T_S_SOLUTION.FEEDBACK
     */
    private String feedback;

    /**
     * 方案状态(int类型标识)
     * 表字段 : T_S_SOLUTION.STATE
     * 0:待审核    1:审核中   2:审核通过
     */
    private Integer state;

    /**
     * 方案编制时间
     * 表字段 : T_S_SOLUTION.SOLUTION_TIME
     */
    private Date solutionTime;

    /**
     * 方案制定人
     * 表字段 : T_S_SOLUTION.DESIGNER_NAME
     */
    private String designerName;

    
    
    /**
     * 获取 替代方案编号(主键) 字段:T_S_SOLUTION.SOLUTION_ID
     *
     * @return T_S_SOLUTION.SOLUTION_ID, 替代方案编号(主键)
     */
    public String getSolutionId() {
        return solutionId;
    }

    /**
     * 设置 替代方案编号(主键) 字段:T_S_SOLUTION.SOLUTION_ID
     *
     * @param solutionId the value for T_S_SOLUTION.SOLUTION_ID, 替代方案编号(主键)
     */
    public void setSolutionId(String solutionId) {
        this.solutionId = solutionId == null ? null : solutionId.trim();
    }

    /**
     * 获取 淘汰物资编码 字段:T_S_SOLUTION.OBSOLETE_UNIT_CODE
     *
     * @return T_S_SOLUTION.OBSOLETE_UNIT_CODE, 淘汰物资编码
     */
    public String getObsoleteUnitCode() {
        return obsoleteUnitCode;
    }

    /**
     * 设置 淘汰物资编码 字段:T_S_SOLUTION.OBSOLETE_UNIT_CODE
     *
     * @param obsoleteUnitCode the value for T_S_SOLUTION.OBSOLETE_UNIT_CODE, 淘汰物资编码
     */
    public void setObsoleteUnitCode(String obsoleteUnitCode) {
        this.obsoleteUnitCode = obsoleteUnitCode == null ? null : obsoleteUnitCode.trim();
    }

    /**
     * 获取 淘汰物资名称 字段:T_S_SOLUTION.OBSOLETE_UNIT_NAME
     *
     * @return T_S_SOLUTION.OBSOLETE_UNIT_NAME, 淘汰物资名称
     */
    public String getObsoleteUnitName() {
        return obsoleteUnitName;
    }

    /**
     * 设置 淘汰物资名称 字段:T_S_SOLUTION.OBSOLETE_UNIT_NAME
     *
     * @param obsoleteUnitName the value for T_S_SOLUTION.OBSOLETE_UNIT_NAME, 淘汰物资名称
     */
    public void setObsoleteUnitName(String obsoleteUnitName) {
        this.obsoleteUnitName = obsoleteUnitName == null ? null : obsoleteUnitName.trim();
    }

    /**
     * 获取 淘汰物资型号 字段:T_S_SOLUTION.OBSOLETE_UNIT_MODEL
     *
     * @return T_S_SOLUTION.OBSOLETE_UNIT_MODEL, 淘汰物资型号
     */
    public String getObsoleteUnitModel() {
        return obsoleteUnitModel;
    }

    /**
     * 设置 淘汰物资型号 字段:T_S_SOLUTION.OBSOLETE_UNIT_MODEL
     *
     * @param obsoleteUnitModel the value for T_S_SOLUTION.OBSOLETE_UNIT_MODEL, 淘汰物资型号
     */
    public void setObsoleteUnitModel(String obsoleteUnitModel) {
        this.obsoleteUnitModel = obsoleteUnitModel == null ? null : obsoleteUnitModel.trim();
    }

    /**
     * 获取 淘汰设备编码 字段:T_S_SOLUTION.OBSOLETE_EQUIPMENT_CODE
     *
     * @return T_S_SOLUTION.OBSOLETE_EQUIPMENT_CODE, 淘汰设备编码
     */
    public String getObsoleteEquipmentCode() {
        return obsoleteEquipmentCode;
    }

    /**
     * 设置 淘汰设备编码 字段:T_S_SOLUTION.OBSOLETE_EQUIPMENT_CODE
     *
     * @param obsoleteEquipmentCode the value for T_S_SOLUTION.OBSOLETE_EQUIPMENT_CODE, 淘汰设备编码
     */
    public void setObsoleteEquipmentCode(String obsoleteEquipmentCode) {
        this.obsoleteEquipmentCode = obsoleteEquipmentCode == null ? null : obsoleteEquipmentCode.trim();
    }

    /**
     * 获取 替代物资编码 字段:T_S_SOLUTION.REPLACE_UNIT_CODE
     *
     * @return T_S_SOLUTION.REPLACE_UNIT_CODE, 替代物资编码
     */
    public String getReplaceUnitCode() {
        return replaceUnitCode;
    }

    /**
     * 设置 替代物资编码 字段:T_S_SOLUTION.REPLACE_UNIT_CODE
     *
     * @param replaceUnitCode the value for T_S_SOLUTION.REPLACE_UNIT_CODE, 替代物资编码
     */
    public void setReplaceUnitCode(String replaceUnitCode) {
        this.replaceUnitCode = replaceUnitCode == null ? null : replaceUnitCode.trim();
    }

    /**
     * 获取 替代物资名称 字段:T_S_SOLUTION.REPLACE_UNIT_NAME
     *
     * @return T_S_SOLUTION.REPLACE_UNIT_NAME, 替代物资名称
     */
    public String getReplaceUnitName() {
        return replaceUnitName;
    }

    /**
     * 设置 替代物资名称 字段:T_S_SOLUTION.REPLACE_UNIT_NAME
     *
     * @param replaceUnitName the value for T_S_SOLUTION.REPLACE_UNIT_NAME, 替代物资名称
     */
    public void setReplaceUnitName(String replaceUnitName) {
        this.replaceUnitName = replaceUnitName == null ? null : replaceUnitName.trim();
    }

    /**
     * 获取 替代物资型号 字段:T_S_SOLUTION.REPLACE_UNIT_MODEL
     *
     * @return T_S_SOLUTION.REPLACE_UNIT_MODEL, 替代物资型号
     */
    public String getReplaceUnitModel() {
        return replaceUnitModel;
    }

    /**
     * 设置 替代物资型号 字段:T_S_SOLUTION.REPLACE_UNIT_MODEL
     *
     * @param replaceUnitModel the value for T_S_SOLUTION.REPLACE_UNIT_MODEL, 替代物资型号
     */
    public void setReplaceUnitModel(String replaceUnitModel) {
        this.replaceUnitModel = replaceUnitModel == null ? null : replaceUnitModel.trim();
    }

    /**
     * 获取 替代建议 字段:T_S_SOLUTION.REPLACE_SUGGEST
     *
     * @return T_S_SOLUTION.REPLACE_SUGGEST, 替代建议
     */
    public String getReplaceSuggest() {
        return replaceSuggest;
    }

    /**
     * 设置 替代建议 字段:T_S_SOLUTION.REPLACE_SUGGEST
     *
     * @param replaceSuggest the value for T_S_SOLUTION.REPLACE_SUGGEST, 替代建议
     */
    public void setReplaceSuggest(String replaceSuggest) {
        this.replaceSuggest = replaceSuggest == null ? null : replaceSuggest.trim();
    }

    /**
     * 获取 客户反馈 字段:T_S_SOLUTION.FEEDBACK
     *
     * @return T_S_SOLUTION.FEEDBACK, 客户反馈
     */
    public String getFeedback() {
        return feedback;
    }

    /**
     * 设置 客户反馈 字段:T_S_SOLUTION.FEEDBACK
     *
     * @param feedback the value for T_S_SOLUTION.FEEDBACK, 客户反馈
     */
    public void setFeedback(String feedback) {
        this.feedback = feedback == null ? null : feedback.trim();
    }

    /**
     * 获取 方案状态(int类型标识) 字段:T_S_SOLUTION.STATE
     *
     * @return T_S_SOLUTION.STATE, 方案状态(int类型标识)
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置 方案状态(int类型标识) 字段:T_S_SOLUTION.STATE
     *
     * @param state the value for T_S_SOLUTION.STATE, 方案状态(int类型标识)
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取 方案编制时间 字段:T_S_SOLUTION.SOLUTION_TIME
     *
     * @return T_S_SOLUTION.SOLUTION_TIME, 方案编制时间
     */
    public Date getSolutionTime() {
        return solutionTime;
    }

    /**
     * 设置 方案编制时间 字段:T_S_SOLUTION.SOLUTION_TIME
     *
     * @param solutionTime the value for T_S_SOLUTION.SOLUTION_TIME, 方案编制时间
     */
    public void setSolutionTime(Date solutionTime) {
        this.solutionTime = solutionTime;
    }

    /**
     * 获取 方案制定人 字段:T_S_SOLUTION.DESIGNER_NAME
     *
     * @return T_S_SOLUTION.DESIGNER_NAME, 方案制定人
     */
    public String getDesignerName() {
        return designerName;
    }

    /**
     * 设置 方案制定人 字段:T_S_SOLUTION.DESIGNER_NAME
     *
     * @param designerName the value for T_S_SOLUTION.DESIGNER_NAME, 方案制定人
     */
    public void setDesignerName(String designerName) {
        this.designerName = designerName == null ? null : designerName.trim();
    }
}