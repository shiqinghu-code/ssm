package com.qing.hu.controller;

import com.qing.hu.entity.EctCnAfterReport;
import com.qing.hu.repository.EctCnAfterReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/ectcnafterreport")
public class EctCnAfterReportController {
    @Autowired
    EctCnAfterReportRepository ectCnAfterReportRepository;

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public List<EctCnAfterReport> getEctCnAfterReportList() {
        return ectCnAfterReportRepository.findAll();
    }
}