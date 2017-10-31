package com.hlxd.glhdcs.service;


import java.util.Set;

/**
 * 员工service接口
 *
 * @author RunRunAgo
 */
public interface TRRoleService {
    /**
     * 查询用户角色
     * @param employeeCode 用户员工编码
     * @return
     */
    Set<String> findRoleByEmployeeCode(String employeeCode);
}
