package com.qing.hu.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qing.hu.entity.EctCnSysLog;
import com.qing.hu.mapper.EctCnSysLogMapper;
import com.qing.hu.mapper.base.BaseMapper;
import com.qing.hu.service.ILogService;
import com.qing.hu.service.base.impl.BaseService;
import com.qing.hu.util.UUIDGenerator;

import tk.mybatis.mapper.entity.Example;

@Service
public class LogService  extends BaseService<EctCnSysLog, String, Object> implements ILogService {

	  
	 
	    
	@Resource
	EctCnSysLogMapper ectCnSysLogMapper;

	  // 重写BaseServiceImpl抽象方法，将当前Mapper返回 
    @Override 
    protected BaseMapper<EctCnSysLog> getBaseMapper() { return ectCnSysLogMapper; } 
    
	public int saveLogEntity(Object entity, String loggerType, Class<?> entityClass, String info) {
		// 组装LoggerEntity对象信息
		EctCnSysLog logger = new EctCnSysLog();
		logger.setLogId(UUIDGenerator.getUUID32());
		logger.setOperateContent(entity.toString()+","+loggerType+","+info);
		
		logger.setDelFlg("0");
		logger.setInsTime(new Timestamp(System.currentTimeMillis()));
		logger.setInsUserId("新增de用户名");
		logger.setUpdTime(new Timestamp(System.currentTimeMillis()));
		logger.setUpdUserId("更新de用户名");
    	
		// ...
		return ectCnSysLogMapper.insert(logger);
	}

	@Override
	public List<EctCnSysLog> queryAll(String id) {
		// TODO Auto-generated method stub
		return ectCnSysLogMapper.selectAll();
	}

 
}
