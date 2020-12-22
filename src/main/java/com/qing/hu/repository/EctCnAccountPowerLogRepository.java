package com.qing.hu.repository;

import com.qing.hu.entity.EctCnAccountPowerLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface EctCnAccountPowerLogRepository extends JpaRepository<EctCnAccountPowerLog, String> {
}