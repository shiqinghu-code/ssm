package com.qing.hu.service.base.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qing.hu.entity.EctCnSysLog;
import com.qing.hu.entity.base.BaseEntity;
import com.qing.hu.mapper.base.BaseMapper;
import com.qing.hu.service.ILogService;
import com.qing.hu.service.base.IBaseService;

import tk.mybatis.mapper.entity.Example;

/**
 * @Description: 服务层基类实现类
 * 注：自定义需要保存对象日志的操作方法（insert，update，delete操作必须记录日志！）
 */
public abstract class BaseService<T extends BaseEntity , ID, EXAMPLE> implements IBaseService<T, ID, EXAMPLE>{

 
	    @Autowired
	     private ILogService logService;
	    
		// 定义抽象方法getBaseMapper获取当前实体Mapper对象
	    protected abstract BaseMapper<T> getBaseMapper();

	   
	    @Transactional(rollbackOn = Exception.class)
	    public int save(T record) {
	    	record.setDelFlg("0");
	    	record.setInsTime(new Timestamp(System.currentTimeMillis()));
	    	record.setInsUserId("新增de用户名");
	    	record.setUpdTime(new Timestamp(System.currentTimeMillis()));
	    	record.setUpdUserId("更新de用户名");
	    	
	        int res = getBaseMapper().insert(record);
	        logService.saveLogEntity(record, "insert", record.getClass(), null);
	        return res;
	    }

	   
	    @Transactional(rollbackOn = Exception.class)
	    public int saveSelective(T record) {
	    	record.setDelFlg("0");
	    	record.setInsTime(new Timestamp(System.currentTimeMillis()));
	    	record.setInsUserId("新增de用户名");
	    	record.setUpdTime(new Timestamp(System.currentTimeMillis()));
	    	record.setUpdUserId("更新de用户名");
	    	
	    	
	        int res = getBaseMapper().insertSelective(record);
	        logService.saveLogEntity(record, "insert", record.getClass(), null);
	        return res;
	    }

	   
	    @Transactional(rollbackOn = Exception.class)
	    public int saveList(java.util.List<? extends T> list) {
	    	 
	        int res = getBaseMapper().insertList(list);
	        list.forEach(record -> logService.saveLogEntity(record, "insert", record.getClass(), null));
	        return res;
	    }

	   
	    @Transactional(rollbackOn = Exception.class)
	    public int delete(T record) {
	        int res = getBaseMapper().delete(record);
	        logService.saveLogEntity(record, "delete", record.getClass(), null);
	        return res;
	    }

	   
	    @Transactional(rollbackOn = Exception.class)
	    public int deleteByExample(T record, EXAMPLE example) {
	        int res = getBaseMapper().deleteByExample(example);
	        logService.saveLogEntity(record, "delete", record.getClass(), null);
	        return res;
	    }

	   
	    @Transactional(rollbackOn = Exception.class)
	    public int deleteByPrimaryKey(T record, ID key) {
	        int res = getBaseMapper().deleteByPrimaryKey(key);
	        logService.saveLogEntity(record, "delete", record.getClass(), null);
	        return res;
	    }

	   
	    @Transactional(rollbackOn = Exception.class)
	    public int updateByExample(T record, EXAMPLE example) {
	    	record.setUpdTime(new Timestamp(System.currentTimeMillis()));
	    	record.setUpdUserId("更新de用户名");
	    	
	        int res = getBaseMapper().updateByExample(record, example);
	        logService.saveLogEntity(record, "update", record.getClass(), null);
	        return res;
	    }

	   
	    @Transactional(rollbackOn = Exception.class)
	    public int updateByExampleSelective(T record, EXAMPLE example) {
	    	record.setUpdTime(new Timestamp(System.currentTimeMillis()));
	    	record.setUpdUserId("更新de用户名");
	    	
	        int res = getBaseMapper().updateByExampleSelective(record, example);
	        logService.saveLogEntity(record, "update", record.getClass(), null);
	        return res;
	    }

	   
	    @Transactional(rollbackOn = Exception.class)
	    public int updateByPrimaryKey(T record) {
	    	record.setUpdTime(new Timestamp(System.currentTimeMillis()));
	    	record.setUpdUserId("更新de用户名");
	    	
	        int res = getBaseMapper().updateByPrimaryKey(record);
	        logService.saveLogEntity(record, "update", record.getClass(), null);
	        return res;
	    }

	    @Transactional(rollbackOn = Exception.class)
	    public int updateByPrimaryKeySelective(T record) {
	    	record.setUpdTime(new Timestamp(System.currentTimeMillis()));
	    	record.setUpdUserId("更新de用户名");
	    	
	        int res = getBaseMapper().updateByPrimaryKeySelective(record);
	        logService.saveLogEntity(record, "update", record.getClass(), null);
	        return res;
	    }
	    
	    public PageInfo<T> getPageList(Example example, int pageNum, int pageSize) {
			// TODO Auto-generated method stub
			PageHelper.startPage(pageNum, pageSize);
			List<T>  list=getBaseMapper().selectByExample(example);
			PageInfo<T> pageInfo = new PageInfo<T>(list);
		    return pageInfo;
		}
	    
	}

