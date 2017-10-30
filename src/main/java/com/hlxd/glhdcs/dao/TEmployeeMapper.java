package com.hlxd.glhdcs.dao;

import com.hlxd.glhdcs.pojo.TEmployee;
import com.hlxd.glhdcs.pojo.TEmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEmployeeMapper {
    /**
     *  根据指定的条件获取数据库记录数,T_EMPLOYEE
     *
     * @param example
     */
    int countByExample(TEmployeeExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,T_EMPLOYEE
     *
     * @param example
     */
    int deleteByExample(TEmployeeExample example);

    /**
     *  新写入数据库记录,T_EMPLOYEE
     *
     * @param record
     */
    int insert(TEmployee record);

    /**
     *  动态字段,写入数据库记录,T_EMPLOYEE
     *
     * @param record
     */
    int insertSelective(TEmployee record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,T_EMPLOYEE
     *
     * @param example
     */
    List<TEmployee> selectByExample(TEmployeeExample example);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,T_EMPLOYEE
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") TEmployee record, @Param("example") TEmployeeExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,T_EMPLOYEE
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") TEmployee record, @Param("example") TEmployeeExample example);
}