package com.ambition.passing.util;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class OutputObject {
	private String returnCode;// �������
	private String returnMessage;// ������Ϣ
	private Object object;// ������
	private Map<String, Object> bean;// ��ֵ��
	private List<Map<String, Object>> beans;// �б�

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnMessage() {
		return returnMessage;
	}

	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public Map<String, Object> getBean() {
		return bean;
	}

	public void setBean(Map<String, Object> bean) {
		this.bean = bean;
	}

	public List<Map<String, Object>> getBeans() {
		return beans;
	}

	public void setBeans(List<Map<String, Object>> beans) {
		this.beans = beans;
	}
}
