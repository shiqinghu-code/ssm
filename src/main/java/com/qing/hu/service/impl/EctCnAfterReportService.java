package com.qing.hu.service.impl;

import com.qing.hu.entity.EctCnAfterReport;
import com.qing.hu.mapper.EctCnAfterReportMapper;
import com.qing.hu.mapper.base.BaseMapper;
import com.qing.hu.service.base.impl.BaseService;
import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;import com.qing.hu.service.IEctCnAfterReportService;

@Service
public class EctCnAfterReportService  extends BaseService<EctCnAfterReport, String, Object> implements IEctCnAfterReportService {
   @Autowired 
    private EctCnAfterReportMapper ectCnAfterReportMapper; 
   // 重写BaseServiceImpl抽象方法，将当前Mapper返回 
    @Override 
    protected BaseMapper<EctCnAfterReport> getBaseMapper() { return ectCnAfterReportMapper; } 

}