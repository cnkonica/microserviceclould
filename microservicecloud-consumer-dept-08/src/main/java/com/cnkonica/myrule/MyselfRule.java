package com.cnkonica.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:MyselfRule
 * Description:todo一句话描述功能
 * Author:konyliu
 * Date:2018/8/24 10:48
 */
@Configuration
public class MyselfRule {

	@Bean
	public IRule myRule(){
		return new RandomRule();
	}
}
