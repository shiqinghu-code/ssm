package com.qing.hu.entity;

import com.qing.hu.entity.base.BaseEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.*;

@Entity
@SuperBuilder
@Data
@Table
@org.hibernate.annotations.Table(appliesTo = "ect_cn_sys_log",comment="系统日志表")
@AllArgsConstructor
@NoArgsConstructor
public class EctCnSysLog extends BaseEntity {

    @Id
    @Column(columnDefinition = "varchar(32) comment 'id'") 
    private String logId; 

    @Column(columnDefinition = "text comment '操作内容'") 
    private String operateContent; 

    @Column(columnDefinition = "varchar(32) comment '操作状态'") 
    private String operateState; 

    @Column(columnDefinition = "text comment '备注'") 
    private String remark; 
}