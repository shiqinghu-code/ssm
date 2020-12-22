package com.qing.hu.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.qing.hu.entity.EctCnSysLog;
import com.qing.hu.service.base.IBaseService;

import tk.mybatis.mapper.entity.Example;

public interface ILogService  extends IBaseService<EctCnSysLog, String, Object> {
	    int saveLogEntity(Object entity, String loggerType, Class<?> entityClass, String info);

		List<EctCnSysLog> queryAll(String id);

		
}
