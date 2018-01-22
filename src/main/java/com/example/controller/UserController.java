package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.po.User;
@Controller
public class UserController {
	@RequestMapping("w")
	public String index(ModelMap map){
		User user = new User();
		map.addAttribute("user", user);
		return "index";
	}
}
