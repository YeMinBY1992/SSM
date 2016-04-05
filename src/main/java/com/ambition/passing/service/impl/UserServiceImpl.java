package com.ambition.passing.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ambition.passing.dao.IUserDao;
import com.ambition.passing.pojo.User;
import com.ambition.passing.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;

	@Override
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}

}
