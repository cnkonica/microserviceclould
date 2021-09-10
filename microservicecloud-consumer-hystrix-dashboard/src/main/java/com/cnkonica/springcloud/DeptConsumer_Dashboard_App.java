package com.cnkonica.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * ClassName:DeptConsumer_Dashboard_App
 * Description:todo一句话描述功能
 * Author:konyliu
 * Date:2018/8/24 16:01
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_Dashboard_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer_Dashboard_App.class, args);
	}
}
