//package com.qing.hu;
//
//import java.util.HashMap;
//
//import org.springframework.web.client.RestTemplate;
//
//public class TestPrint {
//    public static void main(String[] args) {
//        RestTemplate restTemplate=new RestTemplate();
//        HashMap param=new HashMap();
//        param.put("username","admin");
//        param.put("password","123");
//        String result=restTemplate.postForObject("http://127.0.0.1:9082/swagger-ui.html?",param,String.class);
//        System.out.println(result);
//    }
//}
//
