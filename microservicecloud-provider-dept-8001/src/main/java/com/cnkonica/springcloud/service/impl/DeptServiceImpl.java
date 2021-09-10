package com.cnkonica.springcloud.service.impl;

import com.cnkonica.springcloud.dao.DeptMapper;
import com.cnkonica.springcloud.entities.Dept;
import com.cnkonica.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:DeptServiceImpl
 * Description:todo一句话描述功能
 * Author:konyliu
 * Date:2018/8/23 12:41
 */

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptMapper deptMapper;
	@Override
	public boolean add(Dept dept) {

		return deptMapper.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		return deptMapper.findById(id);
	}

	@Override
	public List<Dept> list() {
		return deptMapper.findAll();
	}
}
