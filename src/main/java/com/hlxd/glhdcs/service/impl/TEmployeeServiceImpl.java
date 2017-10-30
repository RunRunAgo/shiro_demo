package com.hlxd.glhdcs.service.impl;

import com.hlxd.glhdcs.dao.TEmployeeMapper;
import com.hlxd.glhdcs.pojo.TEmployee;
import com.hlxd.glhdcs.pojo.TEmployeeExample;
import com.hlxd.glhdcs.service.TEmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 员工业务层
 *
 * @author RunRunAgo
 */
@Service
public class TEmployeeServiceImpl implements TEmployeeService {

    @Resource
    private TEmployeeMapper tEmployeeMapper;

    /**
     * 用户登录
     *
     * @param username 用户名
     * @param password 密码
     * @return
     */
    @Override
    public TEmployee login(String username, String password) {
        System.out.println("用户名=="+username+"密码=="+password);
        TEmployeeExample example = new TEmployeeExample();
        TEmployeeExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(username);
        criteria.andPwdEqualTo(password);
        List<TEmployee> list = tEmployeeMapper.selectByExample(example);
       if(list.size()>0){
           return list.get(0);
       }
        return null;
    }
}
