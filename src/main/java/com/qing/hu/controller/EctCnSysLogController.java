package com.qing.hu.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qing.hu.common.Result;
import com.qing.hu.manager.IEctCnSysLogManager;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/ectCnSysLogController")
public class EctCnSysLogController {
	
	@Resource
	IEctCnSysLogManager ectCnSysLogManager;
	
	 	@ApiOperation("日志列表")
	    @ApiImplicitParam(name = "id",value = "日志id",required = true,dataType = "String")
	    @GetMapping("/seeLog")
	 	public Result  seeLog(String id) {
	 		return ectCnSysLogManager.seeLog(id);
	 	}
	 	@ApiOperation("日志列表分页")
	 	 @ApiImplicitParams({
	 		  @ApiImplicitParam(name = "id",value = "日志id",required = true,dataType = "String"),
	 		  @ApiImplicitParam(name = "pageNum",value = "第几页",required = true,dataType = "int"),
	 		 @ApiImplicitParam(name = "pageSize",value = "每页行数",required = true,dataType = "int")
	 	 })
	  
	    @GetMapping("/seeLogPage")
	 	public Result  seeLogPage(String id, String pageNum,String pageSize) {
	 		return ectCnSysLogManager.seeLogPage( id,  pageNum, pageSize);
	 	}
	 	

}
