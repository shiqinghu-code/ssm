package com.qing.hu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qing.hu.entity.EctCnSysLog;
import com.qing.hu.mapper.EctCnSysLogMapper;
import com.qing.hu.service.ILogService;
import com.qing.hu.util.UUIDGenerator;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class LogService implements ILogService {
	@Resource
	EctCnSysLogMapper ectCnSysLogMapper;

	public int saveLogEntity(Object entity, String loggerType, Class<?> entityClass, String info) {
		// 组装LoggerEntity对象信息
		EctCnSysLog logger = new EctCnSysLog();
		logger.setLogId(UUIDGenerator.getUUID32());
		logger.setOperateContent(entity.toString()+","+loggerType+","+info);
		// ...
		return ectCnSysLogMapper.insert(logger);
	}

}
