package com.hlxd.glhdcs.service;


import com.hlxd.glhdcs.pojo.TEmployee;
import com.hlxd.glhdcs.pojo.TSSolution;

/**
 * 员工service接口
 *
 * @author RunRunAgo
 */
public interface TEmployeeService {

    TEmployee login(String username, char[] password);
}
