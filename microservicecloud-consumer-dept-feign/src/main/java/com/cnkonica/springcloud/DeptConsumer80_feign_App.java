package com.cnkonica.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * ClassName:DeptConsumer80_App
 * Description:todo一句话描述功能
 * Author:konyliu
 * Date:2018/8/23 14:13
 */
@SpringBootApplication
@EnableEurekaClient //启动服务注册客户端
@EnableFeignClients(basePackages = "com.cnkonica.springcloud")
@ComponentScan("com.cnkonica.springcloud")
public class DeptConsumer80_feign_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80_feign_App.class, args);


	}


}
