package com.cnkonica.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ClassName:DeptProvider8001_App
 * Description:todo一句话描述功能
 * Author:konyliu
 * Date:2018/8/23 13:10
 */
@SpringBootApplication
@EnableEurekaClient         //标识时Eureka的客户端,启动自动注册如eureka
@MapperScan("com.cnkonica.springcloud.dao")
@EnableCircuitBreaker //开启断路器组件
public class DeptProvider8001_hystrix_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8001_hystrix_App.class, args);
	}
}
