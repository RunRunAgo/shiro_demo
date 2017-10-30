package com.hlxd.glhdcs.service;


import com.hlxd.glhdcs.pojo.TEmployee;

/**
 * 员工service接口
 *
 * @author RunRunAgo
 */
public interface TEmployeeService {
    /**
     * 获取登录用户信息
     *
     * @param username 账号
     * @param password 密码
     * @return 用户对象
     */
    TEmployee login(String username, String password);
}
