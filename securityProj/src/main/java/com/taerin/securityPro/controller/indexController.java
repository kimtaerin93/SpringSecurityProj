package com.taerin.securityPro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // view를 리턴하겠다!
public class indexController {
	
	@RequestMapping(value = "/")
	public String index() {
		// 머스테치 기본폴더 src/main/resourses/
		// 뷰리졸버 설정 : templates(prefix), .mustache(suffix) // application.yml 생략가능
		return "index";
	}
}