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
@org.hibernate.annotations.Table(appliesTo = "sys_user",comment="用户表")
@AllArgsConstructor
@NoArgsConstructor
public class SysUser extends BaseEntity {

    @Id
    @Column(columnDefinition = "varchar(32.0) comment '用户ID'") 
    private String userId; 

    @Column(columnDefinition = "varchar(20.0) comment '中文名称'") 
    private String name; 

    @Column(columnDefinition = "char(1.0) comment '用户性别/1：男 2：女 3：未知'") 
    private String sex; 

    @Column(columnDefinition = "char(2.0) comment '用户类型/1：集团员工  2：省公司员工  3：地市员工'") 
    private String type; 

    @Column(columnDefinition = "char(1.0) comment '层级/1：集团一级正、副职 领导 2：集团二级正、副职领导和省公司一级正、副职领导 3：集团三级正、副职领导，省公司二级正、副职领导，市公司一级正、副职领导 4：集团普通员工，省公司三级正、副经理，市公司二级正、副经理，县公司一级正、副经理 5：省公司普通员工，市公司三级正、副经理，县公司二级正、副经理 6：市、县公司普通员工'") 
    private String level; 

    @Column(columnDefinition = "char(2.0) comment '职级/1-19'") 
    private String rank; 

    @Column(columnDefinition = "char(2.0) comment '雇佣类型/01：长期员工 02：短期聘用工 03：劳务工 04：聘用港澳台及外籍人员 05：退养人员（工资总额支付） 06：退养人员（其他渠道支付） 07：聘用本单位离退休人员 08：聘用外单位离退休人员 09： 离退休人员（除本单位返聘） 10：临时员工'") 
    private String employeeType; 

    @Column(columnDefinition = "varchar(10.0) comment '省份代码'") 
    private String provinceCode; 

    @Column(columnDefinition = "date comment '出生年月日'") 
    private Date birthday; 

    @Column(columnDefinition = "varchar(20.0) comment '国家'") 
    private String country; 

    @Column(columnDefinition = "varchar(20.0) comment '民族'") 
    private String nation; 

    @Column(columnDefinition = "varchar(20.0) comment '身份证号'") 
    private String idCardNumber; 

    @Column(columnDefinition = "varchar(255.0) comment '通讯地址'") 
    private String postAddress; 

    @Column(columnDefinition = "varchar(20.0) comment '办公电话'") 
    private String telephone; 

    @Column(columnDefinition = "varchar(20.0) comment '传真'") 
    private String fax; 

    @Column(columnDefinition = "varchar(80) comment '邮箱地址'") 
    private String email; 

    @Column(columnDefinition = "varchar(20) comment '移动电话'") 
    private String mobile; 

    @Column(columnDefinition = "char(2) comment '状态/0：正常 1：锁定 2：未启用 3：注销'") 
    private String status; 

    @Column(columnDefinition = "int comment '排序号'") 
    private Integer orderNo; 

    @Column(columnDefinition = "varchar(60.0) comment 'SMAP平台同步过来的移动账号'") 
    private String uId; 
}