package com.woniuxy.springbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniuxy.springbook.entity.Stu;
import com.woniuxy.springbook.service.StuService;
// 类似于本类全部方法上都添加了@ResponseBody
@RestController
@Controller
public class StuController {

	@Autowired
	StuService stuService;
	
	@RequestMapping("/getStu")
	public List<Stu> getStuAll() {
		List<Stu> stus = stuService.getAllStu();
		System.out.println(stus);
		return stus;
	}
}
