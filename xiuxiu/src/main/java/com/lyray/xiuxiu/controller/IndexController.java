package com.lyray.xiuxiu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author hzlihui2014
 *
 */
@Controller
public class IndexController {

	@RequestMapping("/index")
	public @ResponseBody String index(){
		return "Hello xiuxiu!";
	}
	
}
