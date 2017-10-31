package com.hlxd.glhdcs.service.impl;

import com.hlxd.glhdcs.dao.TRRoleMapper;
import com.hlxd.glhdcs.service.TRRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * 员工业务层
 *
 * @author RunRunAgo
 */
@Service
public class TRRoleServiceImpl implements TRRoleService {

    @Autowired
    private TRRoleMapper tRRoleMapper;

    /**
     * 查询用户角色
     * @param userId 用户id
     * @return 角色名集合
     */
/*    @Override
    public Set<String> findRoleByUserId(String userId) {


        return null;
    }*/

    @Override
    public Set<String> findRoleByEmployeeCode(String employeeCode) {
        return null;
    }
}
