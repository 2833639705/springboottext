package com.woniuxy.springbook.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.springbook.dao.StuDao;
import com.woniuxy.springbook.entity.Stu;
import com.woniuxy.springbook.service.StuService;

@Service
public class StuServiceImpl implements StuService {
	@Autowired
	StuDao stuDao;
	
	@Transactional
	@Override
	public void addStu() {
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
		stuDao.insertStu(new Stu(null, "多多", sd.format(new Date())));
		if(true) {
			throw new RuntimeException("Exception");
		}
		stuDao.insertStu(new Stu(null, "莉莉", sd.format(new Date())));
	}

	@Override
	public List<Stu> getAllStu() {
		return stuDao.selectAllStu();
	}
}
