package com.hlxd.glhdcs.dao;

import com.hlxd.glhdcs.pojo.TRRole;
import com.hlxd.glhdcs.pojo.TRRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRRoleMapper {
    /**
     *  根据指定的条件获取数据库记录数,T_R_ROLE
     *
     * @param example
     */
    int countByExample(TRRoleExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,T_R_ROLE
     *
     * @param example
     */
    int deleteByExample(TRRoleExample example);

    /**
     *  新写入数据库记录,T_R_ROLE
     *
     * @param record
     */
    int insert(TRRole record);

    /**
     *  动态字段,写入数据库记录,T_R_ROLE
     *
     * @param record
     */
    int insertSelective(TRRole record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,T_R_ROLE
     *
     * @param example
     */
    List<TRRole> selectByExample(TRRoleExample example);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,T_R_ROLE
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") TRRole record, @Param("example") TRRoleExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,T_R_ROLE
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") TRRole record, @Param("example") TRRoleExample example);
}