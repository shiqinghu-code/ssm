package com.qing.hu.controller;

import com.qing.hu.entity.SysUser;
import com.qing.hu.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/sysuser")
public class SysUserController {
    @Autowired
    ISysUserService sysUserService;

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public List<SysUser> getSysUserList() {
        return sysUserService.findAll();
    }
}