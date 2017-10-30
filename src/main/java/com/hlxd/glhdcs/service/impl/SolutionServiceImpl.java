package com.hlxd.glhdcs.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hlxd.glhdcs.dao.TSSolutionMapper;
import com.hlxd.glhdcs.pojo.TSSolution;
import com.hlxd.glhdcs.service.SolutionService;
/**
 *替代方案业务层
 * @author RunRunAgo
 *
 */
@Service
public class SolutionServiceImpl implements SolutionService {
	@Resource
	private TSSolutionMapper solutionMapper;
	/**
	 * 添加
	 */
	@Override
	public void insertSolution(TSSolution record) {
		solutionMapper.insert(record);
		
	}
	
	/**
	 * 删除
	 */
	@Override
    public void deleteSolution(String id) {
		solutionMapper.deleteByPrimaryKey(id);
	}
	/**
	 * 修改方案
	 */
	@Override
	public void deleteSolution(TSSolution record) {
		solutionMapper.updateByPrimaryKey(record);
		
	}
	/**
	 * 更新状态
	 * 
	 */
	@Override
	public void updateState(String id,Integer state) {
		TSSolution ts=new TSSolution();
		for (int i = 0; i < 9; i++) {
			ts.setSolutionId("编码00"+i);
			ts.setState(state);
			solutionMapper.updateByPrimaryKeySelective(ts);
		}

		
	}
	
	
	
}
