package com.qing.hu;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qing.hu.entity.EctCnAccountPowerLog;
import com.qing.hu.service.IEctCnAccountPowerLogService;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {App.class})
public class AppTest{ 
	@Resource
	IEctCnAccountPowerLogService ectCnAccountPowerLogService;
	
	
	 @Test
	 public  void testApp() { 

 
		 for(int i =0 ; i<10;i++) {
			 EctCnAccountPowerLog log=new EctCnAccountPowerLog();
			 log.setLogId("a"+i);
			 ectCnAccountPowerLogService.save(log);
		 }
		
		 
		 
	 }
}
