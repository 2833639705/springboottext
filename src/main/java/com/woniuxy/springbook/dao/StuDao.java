package com.woniuxy.springbook.dao;

import java.util.List;

import com.woniuxy.springbook.entity.Stu;
// 自动生成接口的实现类--一般再主类上加
//@Mapper
public interface StuDao {
	void insertStu(Stu stu);
	List<Stu> selectAllStu();
}
