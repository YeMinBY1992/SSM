package com.ambition.passing.service.impl;

import javax.annotation.Resource;

import com.ambition.passing.dao.impl.BaseDaoImpl;

public class BaseServiceImpl {
	@Resource
	private BaseDaoImpl baseDao;

	public BaseDaoImpl getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDaoImpl baseDao) {
		this.baseDao = baseDao;
	}
}
