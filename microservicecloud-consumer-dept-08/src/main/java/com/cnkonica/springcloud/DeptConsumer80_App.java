package com.cnkonica.springcloud;

import com.cnkonica.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * ClassName:DeptConsumer80_App
 * Description:todo一句话描述功能
 * Author:konyliu
 * Date:2018/8/23 14:13
 */
@SpringBootApplication
@EnableEurekaClient //启动服务注册客户端
//启动微服务的时候就去加载自定义的ribbon配置类,MyselfRule不能放在@ComponentScan所在包和子包下
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration = MyselfRule.class)
public class DeptConsumer80_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80_App.class, args);


	}


}
