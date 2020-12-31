package com.qing.hu;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.DependsOn;
import org.springframework.test.context.junit4.SpringRunner;

import com.qing.hu.entity.EctCnSysLog;
import com.qing.hu.redis.RedisUtilsStatic;
import com.qing.hu.service.IEctCnAccountPowerLogService;



 


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {App.class})
public class AppTest{ 
	@Resource
	IEctCnAccountPowerLogService ectCnAccountPowerLogService;

	 @Test
	 public  void testApp() { 
		 //RedisUtils redisUtils =SpringUtil.getBean("redisUtils",RedisUtils.class);
		 EctCnSysLog a=new EctCnSysLog();
		 a.setLogId("11111111111");
		 a.setRemark("中文");
		 RedisUtilsStatic.set(a.getLogId(), a);
		 System.out.println("-------------->"+RedisUtilsStatic.get("11111111111"));
		
		
		 
		 
	 }
}
