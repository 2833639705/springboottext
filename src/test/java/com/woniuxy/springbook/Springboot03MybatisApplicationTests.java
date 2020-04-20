package com.woniuxy.springbook;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.woniuxy.springbook.dao.StuDao;
import com.woniuxy.springbook.entity.Stu;
import com.woniuxy.springbook.service.StuService;

@SpringBootTest
class Springboot03MybatisApplicationTests {

	@Autowired
	StuDao stuDao;
	@Autowired
	StuService stuService;
	@Autowired
	DataSource dataSource;
	
	@Test
	void contextLoads() {
	}
	@Test
	void test1() {
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
		Stu stu=new Stu(null, "zs", sd.format(new Date()));
		stuDao.insertStu(stu);
	}
	@Test
	void test2() {
		System.out.println(stuDao.selectAllStu());
	}
	@Test
	void test3() {
		stuService.addStu();
	}
	@Test
	void test4() {
		System.out.println(dataSource);
		System.out.println(dataSource.getClass().getName());
	}
}
