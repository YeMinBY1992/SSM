package com.ambition.passing.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ambition.passing.bean.User;
import com.ambition.passing.service.IUserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Resource
	private IUserService userService;

	@RequestMapping(value = "/showUser")
	public String toIndex(HttpServletRequest request, Model model) {
		System.out.println("hah");
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		System.out.println("toIndex");
		return "showUser";
	}
}
