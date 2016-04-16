package com.ambition.passing.dao;

import java.util.List;
import java.util.Map;

/**
 * 
 * @ClassName: IBaseDao
 * @Description: 基础Dao层文件
 * @author: zhengchaojie
 * @date 2016年4月16日 下午3:58:21
 *
 */
public interface IBaseDao {
	/**
	 * 
	 * @Description:根据Id获取对象
	 * @param sqlId
	 *            脚本编号
	 * @param id
	 *            主键
	 * @return Object 对象
	 * @Date: 2016年4月16日
	 * @author:zhengchaojie
	 */
	public Object queryForObject(String sqlId, int id);

	/**
	 * 
	 * @Description: 根据Id获取对象
	 * @param sqlId
	 *            脚本编号
	 * @param id
	 *            主键
	 * @param cls
	 *            返回的对象class
	 * @return T cls对应的类
	 * @Date: 2016年4月16日
	 * @author:zhengchaojie
	 */
	public <T> T queryForObject(String sqlId, int id, Class<T> cls);

	/**
	 * 
	 * @Description: 根据条件获取对象
	 * @param sqlId
	 *            脚本编号
	 * @param params
	 *            参数
	 * @return Object 返回的对象
	 * @Date: 2016年4月16日
	 * @author:zhengchaojie
	 */
	public Object queryForObject(String sqlId, Map<String, Object> params);

	/**
	 * 
	 * @Description: 根据条件获取对象
	 * @param sqlId
	 *            脚本编号
	 * @param params
	 *            参数
	 * @param cls
	 *            返回的对象Class
	 * @return T cls对应的类
	 * @Date: 2016年4月16日
	 * @author:zhengchaojie
	 */
	public <T> T queryForObject(String sqlId, Map<String, Object> params, Class<T> cls);

	/**
	 * 
	 * @Description: 获取数据总条数
	 * @param sqlId
	 *            脚本编号
	 * @param params
	 *            参数
	 * @return int 总条数
	 * @Date: 2016年4月16日
	 * @author:zhengchaojie
	 */
	public int getTotalCount(String sqlId, Map<String, Object> params);

	/**
	 * 
	 * @Description: 查询列表
	 * @param sqlId
	 *            脚本编号
	 * @param params
	 *            参数
	 * @param cls
	 *            返回的对象Class
	 * @return List<T> 列表<cls对应的类>
	 * @Date: 2016年4月16日
	 * @author:zhengchaojie
	 */
	public <T> List<T> queryForList(String sqlId, Map<String, String> params, Class<T> cls);

	/**
	 * 
	 * @Description: 查询列表
	 * @param sqlId
	 *            脚本编号
	 * @param param
	 *            参数
	 * @return List<Map<String,Object>> 列表
	 * @Date: 2016年4月16日
	 * @author:zhengchaojie
	 */
	public List<Map<String, Object>> queryForList(String sqlId, Map<String, Object> param);

	/**
	 * 
	 * @Description: 更新
	 * @param sqlId
	 *            脚本编号
	 * @param object
	 *            对象
	 * @return int 受影响的行数
	 * @Date: 2016年4月16日
	 * @author:zhengchaojie
	 */
	public int update(String sqlId, Object object);

	/**
	 * 
	 * @Description: 插入
	 * @param sqlId
	 *            脚本编号
	 * @param object
	 *            待插入的对象
	 * @return int 主键
	 * @Date: 2016年4月16日
	 * @author:zhengchaojie
	 */
	public int insert(String sqlId, Object object);

	/**
	 * 
	 * @Description: 删除
	 * @param sqlId
	 *            脚本编号
	 * @param id
	 *            主键
	 * @return int 受影响的行数
	 * @Date: 2016年4月16日
	 * @author:zhengchaojie
	 */
	public int delete(String sqlId, int id);

	/**
	 * 
	 * @Description: 删除
	 * @param sqlId
	 *            脚本编号
	 * @param param
	 *            待删除的对象
	 * @return int 受影响的行数
	 * @Date: 2016年4月16日
	 * @author:zhengchaojie
	 */
	public int delete(String sqlId, Map<String, Object> param);

}
