package com.qing.hu.manager.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.qing.hu.common.PageResult;
import com.qing.hu.common.PageUtils;
import com.qing.hu.common.Result;
import com.qing.hu.entity.EctCnSysLog;
import com.qing.hu.manager.IEctCnSysLogManager;
import com.qing.hu.service.ILogService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service
public class EctCnSysLogManager implements IEctCnSysLogManager {
	@Resource
	ILogService logService;

	@Override
	public Result seeLog(String id) {
		// TODO Auto-generated method stub
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		List<EctCnSysLog> list=logService.queryAll(id);
		resultMap.put("result", list);
		
		if(list!=null&&list.size()>0) {
			return Result.success(list);
		}else {
			return Result.noResult("数据为空");
		}
	}

	@Override
	public Result seeLogPage(String id, String pageNum, String pageSize) {
		// TODO Auto-generated method stub
		pageNum = pageNum == null ? "1" : pageNum;
		pageSize = pageSize == null ? "10" : pageSize;
		Example example=new Example(EctCnSysLog.class);
		Criteria criteria=example.createCriteria();
		PageInfo<EctCnSysLog> info=logService.getPageList(example,Integer.parseInt(pageNum), Integer.parseInt(pageSize));
		
		PageResult result = PageUtils.getPageResult(info);
		
		return Result.success(result);
	}

}
