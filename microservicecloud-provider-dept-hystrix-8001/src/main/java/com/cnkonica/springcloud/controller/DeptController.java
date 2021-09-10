package com.cnkonica.springcloud.controller;

import com.cnkonica.springcloud.entities.Dept;
import com.cnkonica.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:DeptController
 * Description:todo一句话描述功能
 * Author:konyliu
 * Date:2018/8/23 12:47
 */
@RestController
public class DeptController {

	@Autowired
	private DeptService deptService;


	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	//一旦出现服务方法失败或抛出异常,会自动调用@hystrixCommand标注好的fallbackmethod指定的方法
	@HystrixCommand(fallbackMethod = "processHystrixGet")
	public Dept get(@PathVariable("id") Long id) {
		Dept dept =  deptService.get(id);
		if (dept == null) {
			throw new RuntimeException("没有对应信息");
		}
		return dept;
	}

	public Dept processHystrixGet(@PathVariable("id") Long id) {
		Dept dept = new Dept();
		dept.setDeptno(id);
		dept.setDname("没有对应信息");
		dept.setDb_source("no data in database");
		return dept;
	}
}
