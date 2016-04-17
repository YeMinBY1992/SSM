package com.ambition.passing.service;

import java.util.Map;

import com.ambition.passing.bean.User;

public interface IUserService {

	public User getUserById(int userId);

	public int deleteUserById(int userId);

	public int addUser(User user);

	public int updateUserById(User user);

	public User getUserByCondition(Map<String, Object> condition);
}