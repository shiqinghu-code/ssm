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
@org.hibernate.annotations.Table(appliesTo = "ect_cn_after_report",comment="事后报告")
@AllArgsConstructor
@NoArgsConstructor
public class EctCnAfterReport extends BaseEntity {

    @Id
    @Column(columnDefinition = "varchar(32) comment '报告主键，即项目id'") 
    private String reportId; 

    @Column(columnDefinition = "varchar(30) comment '工信部平台项目编号'") 
    private String miniBlockCode; 

    @Column(columnDefinition = "varchar(500) comment '建设地点'") 
    private String constructionAddress; 

    @Column(columnDefinition = "varchar(500) comment '规模'") 
    private String projectSize; 

    @Column(columnDefinition = "varchar(500) comment '资金来源'") 
    private String priceSource; 

    @Column(columnDefinition = "varchar(20) comment '计划竣工开始时间'") 
    private String projectPlanStart; 

    @Column(columnDefinition = "varchar(20) comment '计划竣工结束时间'") 
    private String projectPlanEnd; 

    @Column(columnDefinition = "varchar(20) comment '公告、邀请函发布时间'") 
    private String publicTime; 

    @Column(columnDefinition = "varchar(20) comment '文件售卖开始时间'") 
    private String startBuyTime; 

    @Column(columnDefinition = "varchar(20) comment '文件售卖结束时间'") 
    private String startTime; 

    @Column(columnDefinition = "char(2) comment '本次是否设招标标底总价，代码规则:1是，0否'") 
    private String isObject; 

    @Column(columnDefinition = "int comment '本次招标标底总价，万元单位，如果标底价则必填'") 
    private Integer objectPriceAll; 

    @Column(columnDefinition = "varchar(50) comment '本次招标标底总价币种，代码规则:10人民币、20美元、30欧元、40日元，'") 
    private String objectCurrency; 

    @Column(columnDefinition = "text comment '资格预审结果'") 
    private String preqResults; 

    @Column(columnDefinition = "longtext comment '投标人'") 
    private String managerId; 

    @Column(columnDefinition = "varchar(20) comment '开标日期'") 
    private String stopTime; 

    @Column(columnDefinition = "varchar(20) comment '开标日期（时）'") 
    private String stopTimeHour; 

    @Column(columnDefinition = "varchar(20) comment '开标日期（分）'") 
    private String stopTimeMinite; 

    @Column(columnDefinition = "varchar(100) comment '唱标地址'") 
    private String singAddress; 

    @Column(columnDefinition = "text comment '评标委员会分组情况'") 
    private String assessmentGroup; 

    @Column(columnDefinition = "varchar(50) comment '评标方法，代码规则1综合评估法、2经评审的最低投标价法、3其他评标方法'") 
    private String assessmentType; 

    @Column(columnDefinition = "text comment '资格后审结果'") 
    private String afterPreqResults; 

    @Column(columnDefinition = "text comment '招标人直接确定评标专家的理由'") 
    private String directReason; 

    @Column(columnDefinition = "varchar(20) comment '中标候选人开始时间'") 
    private String publicStartTime; 

    @Column(columnDefinition = "varchar(20) comment '中标候选人结束时间'") 
    private String publicEndTime; 

    @Column(columnDefinition = "text comment '中标候选人公示媒介'") 
    private String publicWebsite; 

    @Column(columnDefinition = "text comment '其他需要说明的问题'") 
    private String remark; 

    @Column(columnDefinition = "varchar(100) comment '是否已推送管理平台'") 
    private String isPushTx; 
}