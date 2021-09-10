package com.cnkonica.springcloud.service;

import com.cnkonica.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * ClassName:DeptClientServiceFallbackFactory
 * Description:todo一句话描述功能
 * Author:konyliu
 * Date:2018/8/24 15:05
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {


	@Override
	public DeptClientService create(Throwable throwable) {
		return new DeptClientService() {
			@Override
			public boolean add(Dept dept) {
				return false;
			}

			@Override
			public Dept get(Long id) {
				Dept dept = new Dept();
				dept.setDeptno(id);
				dept.setDname("没有对应信息");
				dept.setDb_source("no data in database");
				return dept;
			}

			@Override
			public List<Dept> list() {
				return null;
			}
		};
	}
}
