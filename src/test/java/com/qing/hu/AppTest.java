package com.qing.hu;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qing.hu.entity.EctCnSysLog;
import com.qing.hu.redis.RedisUtilsStatic;
import com.qing.hu.service.IEctCnAccountPowerLogService;
import com.qing.hu.util.SpringUtil;



 


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
	 @Test
	 public  void testApp2() { 
		 //Producer producer =SpringUtil.getBean("producer",Producer.class);
		 //producer.sendChannelMess("test12", "消息2222");
	 }
}
