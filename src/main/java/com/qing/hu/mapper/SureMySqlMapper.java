package com.qing.hu.mapper;

import java.util.LinkedHashMap;
import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface SureMySqlMapper {
	/**
	 * 传入sql 获取 List<LinkedHashMap<String, Object>>
	 * @param sql
	 * @return
	 */
	List<LinkedHashMap<String, Object>> superManagerSelect(String sql);
	
	//使用注解sql 可以解决大多问题
}
