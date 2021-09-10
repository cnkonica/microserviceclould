package com.cnkonica.springcloud.dao;

import com.cnkonica.springcloud.entities.Dept;

import java.util.List;

//@Mapper
public interface DeptMapper {


	 boolean addDept(Dept dept);

	 Dept findById(Long id);

	 List<Dept> findAll();


}
