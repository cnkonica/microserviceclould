package com.cnkonica.springcloud.controller;

import com.cnkonica.springcloud.entities.Dept;
import com.cnkonica.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName:DeptController_Consumer
 * Description:todo一句话描述功能
 * Author:konyliu
 * Date:2018/8/23 13:57
 */
@RestController
public class DeptController_Consumer {
	@Autowired
	private DeptClientService service;

	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id){
		return this.service.get(id);
	}

	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list(){
		return this.service.list();
	}

	@RequestMapping(value = "/consumer/dept/add")
	public Object add(Dept dept){
		return this.service.add(dept);
	}






}
