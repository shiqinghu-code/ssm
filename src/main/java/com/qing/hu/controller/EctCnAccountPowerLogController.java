package com.qing.hu.controller;

import com.qing.hu.entity.EctCnAccountPowerLog;
import com.qing.hu.repository.EctCnAccountPowerLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/ectcnaccountpowerlog")
public class EctCnAccountPowerLogController {
    @Autowired
    EctCnAccountPowerLogRepository ectCnAccountPowerLogRepository;

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public List<EctCnAccountPowerLog> getEctCnAccountPowerLogList() {
        return ectCnAccountPowerLogRepository.findAll();
    }
}