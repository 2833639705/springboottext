package com.woniuxy.springbook.entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stu {
	private Integer sid;
	private String sname;
	private String date;
}
