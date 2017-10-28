package com.hlxd.glhdcs.controller;

import java.sql.Timestamp;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hlxd.glhdcs.pojo.TSSolution;
import com.hlxd.glhdcs.service.SolutionService;

/**
 * 替代方案模块
 * @author RunRunAgo
 *
 */
@Controller
@RequestMapping("solution")
public class SolutionController {
	
	
	@Resource
	private SolutionService solutionService;
	
	@RequestMapping("index")
	public String showIndex() {
		
		return "jsp/index";
	}
	@RequestMapping("right")
	public String showRight() {
		
		return "jsp/right";
	}
	
	/**
	 * 1.添加方案
	 */
	@RequestMapping("insert")
	public String insertSolution(/*@RequestBody TSSolution record*/) {
		TSSolution ts=new  TSSolution();
		for (int i = 0; i <20; i++) {
			ts.setSolutionId("编码00"+i);
			ts.setObsoleteUnitCode("淘汰物资编码001"+i);
			ts.setObsoleteUnitName("淘汰物资名称001"+i);
			ts.setReplaceUnitCode("替代物资编码002"+i);
			ts.setReplaceUnitName("替代物资名称002"+i);
			//SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式  
		    //System.out.println(df.format(new Date()));// new Date()为获取当前系统时间 
			Timestamp timestamp = new Timestamp(new Date().getTime()); //2013-01-14 22:45:36.484  
			System.out.println("时间是"+timestamp);
			ts.setSolutionTime(timestamp);
			ts.setDesignerName("runrunago"+i);
			solutionService.insertSolution(ts);
		}
		
		System.out.println("成功");
		
		return null;
	}
	/**
	 * 2.删除方案
	 */
	@RequestMapping("delete")
	public void deleteSolution(String id) {
		id="123546546";
		solutionService.deleteSolution(id);
	}
	
	/**
	 * 3.修改
	 */
	@RequestMapping("update")
	public void updateSlution(@RequestBody TSSolution record) {
		solutionService.deleteSolution(record);
	}
	/**
	 * 4.分页查询
	 * 
	 */
	
	/**
	 * 5.更新状态	
	 */
	@RequestMapping("updateState")
	public void updateState(String id,Integer state) {
		solutionService.updateState( id, state);
	}
	/**
	 * 6.查询所有
	 * 
	 */
}
