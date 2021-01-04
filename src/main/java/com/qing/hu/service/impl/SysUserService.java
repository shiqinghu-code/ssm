package com.qing.hu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qing.hu.entity.SysUser;
import com.qing.hu.mapper.base.BaseMapper;
import com.qing.hu.mapper.hu.SysUserMapper;
import com.qing.hu.service.ISysUserService;
import com.qing.hu.service.base.impl.BaseService;

@Service
public class SysUserService  extends BaseService<SysUser, String, Object> implements ISysUserService {
    @Autowired 
    private SysUserMapper sysUserMapper; 
    // 重写BaseServiceImpl抽象方法，将当前Mapper返回 
    @Override 
    protected BaseMapper<SysUser> getBaseMapper() { return sysUserMapper; } 

}