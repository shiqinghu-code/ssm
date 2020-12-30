package com.qing.hu;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.DependsOn;
import org.springframework.test.context.junit4.SpringRunner;

import com.qing.hu.entity.EctCnSysLog;
import com.qing.hu.redis.RedisUtils;
import com.qing.hu.service.IEctCnAccountPowerLogService;

import cn.hutool.extra.spring.SpringUtil;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {App.class})
@DependsOn("redisUtils")
public class AppTest{ 
	@Resource
	IEctCnAccountPowerLogService ectCnAccountPowerLogService;
	@Resource
	 RedisUtils redisUtils;
	 @Test
	 public  void testApp() { 
		 EctCnSysLog a=new EctCnSysLog();
		 a.setLogId("11111111111");
		 a.setRemark("中文");
		 redisUtils.set(a.getLogId(), a);
		 System.out.println("-------------->"+redisUtils.get("11111111111"));
		
		
		 
		 
	 }
}
