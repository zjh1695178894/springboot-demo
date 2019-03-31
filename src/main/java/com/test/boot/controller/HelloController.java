package com.test.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.boot.entity.TbUser;
import com.test.boot.mapper.TbUserMapper;

@Controller
public class HelloController {
	@Value("${rest_url}")
	String rest_url;
	
	@Autowired
	private TbUserMapper tbusermapper;
	@ResponseBody
	@RequestMapping("hello")
	public Object hello(){
		
		List<TbUser> list = tbusermapper.findAll();
		return "hello!the url is "+rest_url+"<br>"+list;
	}
}
