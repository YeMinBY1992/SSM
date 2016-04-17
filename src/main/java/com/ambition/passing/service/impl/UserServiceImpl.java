package com.ambition.passing.service.impl;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import com.ambition.passing.bean.User;
import com.ambition.passing.service.IUserService;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl implements IUserService {

	private static Logger logger = Logger.getLogger(UserServiceImpl.class);

	@Override
	public User getUserById(int userId) {
		User user = null;
		try {
			user = (User) this.getBaseDao().queryForObject("getUserById", userId);
		} catch (Exception e) {
			logger.error("userLog:get fail\n", e);
		}
		return user;
	}

	@Override
	public int deleteUserById(int userId) {
		int result = -1;
		try {
			result = this.getBaseDao().delete("deleteUserById", userId);
		} catch (Exception e) {
			logger.error("UserLog:delete fail\n", e);
		}
		return result;
	}

	@Override
	public int addUser(User user) {
		int result = -1;
		try {
			result = this.getBaseDao().insert("addUser", user);
		} catch (Exception e) {
			logger.error("UserLog:add fail\n", e);
		}
		return result;
	}

	@Override
	public int updateUserById(User user) {
		int result = -1;
		try {
			result = this.getBaseDao().update("updateUserById", user);
		} catch (Exception e) {
			logger.error("UserLog:delete fail\n", e);
		}
		return result;
	}

	@Override
	public User getUserByCondition(Map<String, Object> condition) {
		User user = null;
		try {
			user = (User) this.getBaseDao().queryForObject("getUserByCondition", condition);
		} catch (Exception e) {
			logger.error("userLog:get fail\n", e);
		}
		return user;
	}

}
