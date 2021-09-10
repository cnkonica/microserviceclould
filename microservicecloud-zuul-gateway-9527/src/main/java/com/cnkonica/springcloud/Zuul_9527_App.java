package com.cnkonica.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * ClassName:DeptConsumer_Dashboard_App
 * Description:todo一句话描述功能
 * Author:konyliu
 * Date:2018/8/24 16:01
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527_App {
	public static void main(String[] args) {
		SpringApplication.run(Zuul_9527_App.class, args);
	}
}
