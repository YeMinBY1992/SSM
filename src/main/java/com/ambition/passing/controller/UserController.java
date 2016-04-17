package com.ambition.passing.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ambition.passing.bean.User;
import com.ambition.passing.service.IUserService;
import com.ambition.passing.util.OutputObject;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Resource
	private IUserService userService;
	@Resource
	private OutputObject outputObject;

	@RequestMapping(value = "/getUser")
	public String getUser(HttpServletRequest request, Model model) {
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		if (user == null) {
			outputObject.setReturnCode("-9999");
			outputObject.setReturnMessage("获取用户信息失败！");

		} else {
			outputObject.setReturnCode("0000");
			outputObject.setReturnMessage("获取用户信息成功！");
		}
		outputObject.setObject(user);
		model.addAttribute("response", outputObject);
		return "showUser";
	}
}
