package com.ambition.passing.service.impl;

import org.springframework.stereotype.Service;
import com.ambition.passing.bean.User;
import com.ambition.passing.service.IUserService;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl implements IUserService {

	@Override
	public User getUserById(int userId) {
		return (User) this.getBaseDao().queryForObject("getUserById", userId);
	}

}
