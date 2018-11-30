package com.zfsoft.weibo.weibo4j.examples.publicservice;

import com.zfsoft.weibo.weibo4j.PublicService;
import com.zfsoft.weibo.weibo4j.model.WeiboException;
import com.zfsoft.weibo.weibo4j.org.json.JSONArray;


public class ProvinceList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String access_token = args[0];
		String country =args[1];
		PublicService ps = new PublicService();
		ps.client.setToken(access_token);
		try {
			JSONArray jo = ps.provinceList(country);
			System.out.println(jo.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
		
	}

}
