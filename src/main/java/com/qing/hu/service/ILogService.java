package com.qing.hu.service;

public interface ILogService {
	    int saveLogEntity(Object entity, String loggerType, Class<?> entityClass, String info);
}
