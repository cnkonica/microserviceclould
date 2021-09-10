package com.cnkonica.springcloud.service;

import com.cnkonica.springcloud.entities.Dept;

import java.util.List;

/**
 * ClassName:DeptService
 * Description:todo一句话描述功能
 * Author:konyliu
 * Date:2018/8/23 12:40
			*/
	public interface DeptService {


		boolean add(Dept dept);

		Dept get(Long id);

		List<Dept> list();



	}
