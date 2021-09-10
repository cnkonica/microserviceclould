package com.cnkonica.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ClassName:com.cnkonica.springcloud.EurekaServer7001_App
 * Description:todo一句话描述功能
 * Author:konyliu
 * Date:2018/8/23 16:07
 */
@SpringBootApplication
@EnableEurekaServer //启动EurekaServer服务端接受服务注册
public class EurekaServer7001_App {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7001_App.class,args);
	}
}
