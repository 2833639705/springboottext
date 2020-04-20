package com.woniuxy.springbook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
// 启用事务管理
@EnableTransactionManagement
// 自动生成接口的实现类
@MapperScan("com.woniuxy.springbook.dao")
@SpringBootApplication
public class Springboot03MybatisApplication {

	public static void main(String[] args) {
		System.out.println("zs ----aaa");
		SpringApplication.run(Springboot03MybatisApplication.class, args);
	}

}
