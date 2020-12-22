package com.qing.hu.service.impl;

import com.qing.hu.entity.EctCnAccountPowerLog;
import com.qing.hu.mapper.EctCnAccountPowerLogMapper;
import com.qing.hu.mapper.base.BaseMapper;
import com.qing.hu.service.base.impl.BaseService;
import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;import com.qing.hu.service.IEctCnAccountPowerLogService;

@Service
public class EctCnAccountPowerLogService  extends BaseService<EctCnAccountPowerLog, String, Object> implements IEctCnAccountPowerLogService {
   @Autowired 
    private EctCnAccountPowerLogMapper ectCnAccountPowerLogMapper; 
   // 重写BaseServiceImpl抽象方法，将当前Mapper返回 
    @Override 
    protected BaseMapper<EctCnAccountPowerLog> getBaseMapper() { return ectCnAccountPowerLogMapper; } 

}