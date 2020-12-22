package com.qing.hu.entity.base;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@MappedSuperclass
@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity implements Serializable {

	@Column(columnDefinition = "datetime default '1970-01-01 00:00:00' comment '更新时间(更新日期)'")
	private Timestamp upd_time;

	@Column(columnDefinition = "varchar(32) default 'system' comment '更新者ID'")
	private String upd_user_id;

	@Column(columnDefinition = "datetime default '1970-01-01 00:00:00' comment '添加时间(申请日期)'")
	private Timestamp ins_time;

	@Column(columnDefinition = "varchar(32) default 'system' comment '添加人ID'")
	private String ins_user_id;

	@Column(columnDefinition = "varchar(1) default '0' comment '删除FLG/0:未删除;1:已删除'")
	private String del_flg;
}
