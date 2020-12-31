package com.qing.hu.kafka;


import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Consumer {

    /**
     * 有消息就读取,只读取消息value
     */
    @KafkaListener(topics = {"test1"})
    public void receiveMessage(String message){
        //收到通道的消息之后执行秒杀操作
        System.out.println(message);
    }

    /**
     * 有消息就读取,批量读取消息value
     */
    @KafkaListener(topics = "test2")
    public void onMessage(List<String> crs) {
        for(String str : crs){
            System.out.println("test2:" + str);
        }
    }

    /**
     * 有消息就读取,读取消息topic，offset，key，value等信息
     */
    @KafkaListener(topics = "test3")
    public void listenT1(ConsumerRecord<?, ?> cr){
        System.out.println("test3收到消息,topic:>>>" + cr.topic() + "  offset:>>" + cr.offset()+ "  key:>>" + cr.key() + "  value:>>" + cr.value());
    }
}