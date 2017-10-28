package com.hlxd.glhdcs.dao;

import com.hlxd.glhdcs.pojo.TSSolution;
import com.hlxd.glhdcs.pojo.TSSolutionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSSolutionMapper {
    /**
     *  根据指定的条件获取数据库记录数,T_S_SOLUTION
     *
     * @param example
     */
    int countByExample(TSSolutionExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,T_S_SOLUTION
     *
     * @param example
     */
    int deleteByExample(TSSolutionExample example);

    /**
     *  根据主键删除数据库的记录,T_S_SOLUTION
     *
     * @param solutionId
     */
    int deleteByPrimaryKey(String solutionId);

    /**
     *  新写入数据库记录,T_S_SOLUTION
     *
     * @param record
     */
    int insert(TSSolution record);

    /**
     *  动态字段,写入数据库记录,T_S_SOLUTION
     *
     * @param record
     */
    int insertSelective(TSSolution record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,T_S_SOLUTION
     *
     * @param example
     */
    List<TSSolution> selectByExample(TSSolutionExample example);

    /**
     *  根据指定主键获取一条数据库记录,T_S_SOLUTION
     *
     * @param solutionId
     */
    TSSolution selectByPrimaryKey(String solutionId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,T_S_SOLUTION
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") TSSolution record, @Param("example") TSSolutionExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,T_S_SOLUTION
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") TSSolution record, @Param("example") TSSolutionExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,T_S_SOLUTION
     *
     * @param record
     */
    int updateByPrimaryKeySelective(TSSolution record);

    /**
     *  根据主键来更新符合条件的数据库记录,T_S_SOLUTION
     *
     * @param record
     */
    int updateByPrimaryKey(TSSolution record);
}