package com.ambition.passing.dao.impl;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ambition.passing.dao.IBaseDao;

@Repository(value = "baseDao")
public class BaseDaoImpl implements IBaseDao {

	@Resource
	private SqlSession sqlSession;

	@Override
	public Object queryForObject(String sqlId, int id) {
		return sqlSession.selectOne(sqlId, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T queryForObject(String sqlId, int id, Class<T> cls) {
		return (T) sqlSession.selectOne(sqlId, id);
	}

	@Override
	public Object queryForObject(String sqlId, Map<String, Object> params) {
		return sqlSession.selectOne(sqlId, params);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T queryForObject(String sqlId, Map<String, Object> params, Class<T> cls) {
		return (T) sqlSession.selectOne(sqlId, params);
	}

	@Override
	public int getTotalCount(String sqlId, Map<String, Object> params) {
		return sqlSession.selectOne(sqlId, params);
	}

	@Override
	public <T> List<T> queryForList(String sqlId, Map<String, String> params, Class<T> cls) {
		return sqlSession.selectList(sqlId, params);
	}

	@Override
	public List<Map<String, Object>> queryForList(String sqlId, Map<String, Object> param) {
		List<Map<String, Object>> list = sqlSession.selectList(sqlId, param);
		return list;
	}

	@Override
	public int update(String sqlId, Object object) {
		return sqlSession.update(sqlId, object);
	}

	@Override
	public int insert(String sqlId, Object object) {
		return sqlSession.insert(sqlId, object);
	}

	@Override
	public int delete(String sqlId, int id) {
		return sqlSession.delete(sqlId, id);
	}

	@Override
	public int delete(String sqlId, Map<String, Object> param) {
		return sqlSession.delete(sqlId, param);
	}

}
