package com.cnkonica.springcloud.dao;

import com.cnkonica.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
public interface DeptMapper {


	 boolean addDept(Dept dept);

	 Dept findById(Long id);

	 List<Dept> findAll();


}
