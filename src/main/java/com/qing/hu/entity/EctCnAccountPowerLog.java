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
@org.hibernate.annotations.Table(appliesTo = "ect_cn_account_power_log",comment="账号及权限日志表")
@AllArgsConstructor
@NoArgsConstructor
public class EctCnAccountPowerLog extends BaseEntity {

    @Id
    @Column(columnDefinition = "varchar(32) comment 'id'") 
    private String logId; 

    @Column(columnDefinition = "varchar(32) comment '被操作人id'") 
    private String targetUserId; 

    @Column(columnDefinition = "varchar(200) comment '被操作人名称'") 
    private String targetUserName; 

    @Column(columnDefinition = "text comment '被操作人stru_path'") 
    private String targetStruPath; 

    @Column(columnDefinition = "text comment '被操作人stru_path中文'") 
    private String targetStruPathName; 

    @Column(columnDefinition = "datetime comment '操作时间'") 
    private Timestamp operateTime; 

    @Column(columnDefinition = "text comment '操作内容'") 
    private String operateContent; 

    @Column(columnDefinition = "varchar(32) comment '操作状态'") 
    private String operateState; 

    @Column(columnDefinition = "varchar(32) comment '操作人id'") 
    private String operateUserId; 

    @Column(columnDefinition = "varchar(200) comment '操作人名称'") 
    private String operateUserName; 

    @Column(columnDefinition = "text comment '操作人stru_path'") 
    private String operateStruPath; 

    @Column(columnDefinition = "text comment '操作人stru_path中文'") 
    private String operateStruPathName; 

    @Column(columnDefinition = "text comment '备注'") 
    private String remark; 
}