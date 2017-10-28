package com.hlxd.glhdcs.service;


import com.hlxd.glhdcs.pojo.TSSolution;

/**
 * 替代方案service接口
 * @author RunRunAgo
 *
 */
public interface SolutionService {
	
	void insertSolution(TSSolution record);
	
	void deleteSolution(String id);

	void deleteSolution(TSSolution record);

	void updateState(String id, Integer state);
}
