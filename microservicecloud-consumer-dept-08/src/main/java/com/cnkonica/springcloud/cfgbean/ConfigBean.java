package com.cnkonica.springcloud.cfgbean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName:ConfigBean
 * Description:todo一句话描述功能
 * Author:konyliu
 * Date:2018/8/23 13:50
 */
@Configuration // boot --> spring applicationContext.xml = @Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced //使用ribbon负载均衡
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

	// 切换负载均衡robin算法,随机算法
	@Bean
	public IRule myRule(){

		//return new RandomRule();
		//重试算法,几次失败后会实行轮循算法
		return new RetryRule();
	}

}
