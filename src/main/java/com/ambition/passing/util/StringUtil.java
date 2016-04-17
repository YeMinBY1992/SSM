package com.ambition.passing.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public final class StringUtil {
	private StringUtil() {
	}

	public static boolean isNotEmpty(String param) {
		return param != null && !"".equals(param.trim());
	}

	public static boolean isEmpty(String param) {
		return param == null || "".equals(param.trim());
	}

	public static boolean isNum(String str) {
		String regex = "^(-?\\d+)(\\.\\d+)?$";
		return matchRegex(str, regex);
	}

	private static boolean matchRegex(String value, String regex) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(value);
		return matcher.matches();
	}

	public static String createRandomVcode() {
		// 楠岃瘉鐮�
		String vcode = "";
		for (int i = 0; i < 6; i++) {
			vcode = vcode + (int) (Math.random() * 9);
		}
		return vcode;
	}

	public static HashMap<String, Object> reflectJson(JSONObject json) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		Set<?> keys = json.keySet();
		for (Object key : keys) {
			Object o = json.get(key);
			if (o instanceof JSONObject) {
				map.put((String) key, reflectJson((JSONObject) o));
			} else if (o instanceof JSONArray) {
				map.put((String) key, reflectJson((JSONArray) o));
			} else {
				map.put((String) key, o);
			}
		}
		if (map.size() > 0) {
			return map;
		} else {
			return null;
		}

	}

	public static Object reflectJson(JSONArray json) {
		List<Object> list = new ArrayList<Object>();
		for (Object o : json) {
			if (o instanceof JSONObject)
				list.add(reflectJson((JSONObject) o));
			else if (o instanceof JSONArray)
				list.add(reflectJson((JSONArray) o));
			else
				list.add(o);
		}
		if (list.size() > 0) {
			return list;
		}
		return null;
	}

	public static String upperCase(String name) {
		name = name.substring(0, 1).toUpperCase() + name.substring(1);
		return name;
	}

	public static String lowerCase(String name) {
		name = name.substring(0, 1).toLowerCase() + name.substring(1);
		return name;

	}

	public static Map<String, String> URLRequest(String strUrlParam) {
		Map<String, String> mapRequest = new HashMap<String, String>();

		String[] arrSplit = null;
		if (strUrlParam == null) {
			return mapRequest;
		}
		arrSplit = strUrlParam.split("&");
		for (String strSplit : arrSplit) {
			String[] arrSplitEqual = null;
			arrSplitEqual = strSplit.split("=");

			if (arrSplitEqual.length > 1) {
				mapRequest.put(arrSplitEqual[0], arrSplitEqual[1]);

			} else {
				if (arrSplitEqual[0] != "") {
					mapRequest.put(arrSplitEqual[0], "");
				}
			}
		}
		return mapRequest;
	}
}
