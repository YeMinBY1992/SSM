package com.ambition.passing.dao;

import java.util.List;
import java.util.Map;

/**
 * 
 * @ClassName: IBaseDao
 * @Description: ����Dao���ļ�
 * @author: zhengchaojie
 * @date 2016��4��16�� ����3:58:21
 *
 */
public interface IBaseDao {
	/**
	 * 
	 * @Description:����Id��ȡ����
	 * @param sqlId
	 *            �ű����
	 * @param id
	 *            ����
	 * @return Object ����
	 * @Date: 2016��4��16��
	 * @author:zhengchaojie
	 */
	public Object queryForObject(String sqlId, int id);

	/**
	 * 
	 * @Description: ����Id��ȡ����
	 * @param sqlId
	 *            �ű����
	 * @param id
	 *            ����
	 * @param cls
	 *            ���صĶ���class
	 * @return T cls��Ӧ����
	 * @Date: 2016��4��16��
	 * @author:zhengchaojie
	 */
	public <T> T queryForObject(String sqlId, int id, Class<T> cls);

	/**
	 * 
	 * @Description: ����������ȡ����
	 * @param sqlId
	 *            �ű����
	 * @param params
	 *            ����
	 * @return Object ���صĶ���
	 * @Date: 2016��4��16��
	 * @author:zhengchaojie
	 */
	public Object queryForObject(String sqlId, Map<String, Object> params);

	/**
	 * 
	 * @Description: ����������ȡ����
	 * @param sqlId
	 *            �ű����
	 * @param params
	 *            ����
	 * @param cls
	 *            ���صĶ���Class
	 * @return T cls��Ӧ����
	 * @Date: 2016��4��16��
	 * @author:zhengchaojie
	 */
	public <T> T queryForObject(String sqlId, Map<String, Object> params, Class<T> cls);

	/**
	 * 
	 * @Description: ��ȡ����������
	 * @param sqlId
	 *            �ű����
	 * @param params
	 *            ����
	 * @return int ������
	 * @Date: 2016��4��16��
	 * @author:zhengchaojie
	 */
	public int getTotalCount(String sqlId, Map<String, Object> params);

	/**
	 * 
	 * @Description: ��ѯ�б�
	 * @param sqlId
	 *            �ű����
	 * @param params
	 *            ����
	 * @param cls
	 *            ���صĶ���Class
	 * @return List<T> �б�<cls��Ӧ����>
	 * @Date: 2016��4��16��
	 * @author:zhengchaojie
	 */
	public <T> List<T> queryForList(String sqlId, Map<String, String> params, Class<T> cls);

	/**
	 * 
	 * @Description: ��ѯ�б�
	 * @param sqlId
	 *            �ű����
	 * @param param
	 *            ����
	 * @return List<Map<String,Object>> �б�
	 * @Date: 2016��4��16��
	 * @author:zhengchaojie
	 */
	public List<Map<String, Object>> queryForList(String sqlId, Map<String, Object> param);

	/**
	 * 
	 * @Description: ����
	 * @param sqlId
	 *            �ű����
	 * @param object
	 *            ����
	 * @return int ��Ӱ�������
	 * @Date: 2016��4��16��
	 * @author:zhengchaojie
	 */
	public int update(String sqlId, Object object);

	/**
	 * 
	 * @Description: ����
	 * @param sqlId
	 *            �ű����
	 * @param object
	 *            ������Ķ���
	 * @return int ����
	 * @Date: 2016��4��16��
	 * @author:zhengchaojie
	 */
	public int insert(String sqlId, Object object);

	/**
	 * 
	 * @Description: ɾ��
	 * @param sqlId
	 *            �ű����
	 * @param id
	 *            ����
	 * @return int ��Ӱ�������
	 * @Date: 2016��4��16��
	 * @author:zhengchaojie
	 */
	public int delete(String sqlId, int id);

	/**
	 * 
	 * @Description: ɾ��
	 * @param sqlId
	 *            �ű����
	 * @param param
	 *            ��ɾ���Ķ���
	 * @return int ��Ӱ�������
	 * @Date: 2016��4��16��
	 * @author:zhengchaojie
	 */
	public int delete(String sqlId, Map<String, Object> param);

}
