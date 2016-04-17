package com.ambition.passing.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ambition.passing.bean.User;
import com.ambition.passing.service.IUserService;
import com.ambition.passing.util.OutputObject;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
	@Resource
	private IUserService userService;
	@Resource
	private OutputObject outputObject;

	@RequestMapping(value = "/signIn")
	public String signIn(HttpServletRequest request, Model model) {
		String loginName = request.getParameter("loginName");
		String password = request.getParameter("password");
		System.out.println("");
		Map<String, Object> condition = new HashMap<>();
		condition.put("loginName", loginName);
		condition.put("password", password);
		User user = userService.getUserByCondition(condition);
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
