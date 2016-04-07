package com.dkzj.front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/main")
public class Welcome {

	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("username", "junhui.xu");
		return "page/index";
	}
}
