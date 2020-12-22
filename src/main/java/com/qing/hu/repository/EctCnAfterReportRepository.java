package com.qing.hu.repository;

import com.qing.hu.entity.EctCnAfterReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface EctCnAfterReportRepository extends JpaRepository<EctCnAfterReport, String> {
}