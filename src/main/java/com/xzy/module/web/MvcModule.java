package com.xzy.module.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @ClassName: MvcModule 
 * @Description:  该项目Web 模块 该模块详细介绍SpringBoot Mvc 的
 *  restful API 使用
 * @date 2018年4月20日 上午11:21:59   
 *
 */
//@RestController
@Controller
@ResponseBody
public class MvcModule {
	
	@RequestMapping(value="/say")
	public String sayHello() {	
		return "Hello World";
	}
}
