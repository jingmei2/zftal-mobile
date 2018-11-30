package com.zfsoft.weibo.weibo4j.examples.user;

import com.zfsoft.weibo.weibo4j.Users;
import com.zfsoft.weibo.weibo4j.examples.oauth2.Log;
import com.zfsoft.weibo.weibo4j.model.User;
import com.zfsoft.weibo.weibo4j.model.WeiboException;


public class ShowUser {

	public static void main(String[] args) {
		String access_token = args[0];
		String uid =args[1];
		Users um = new Users();
		um.client.setToken(access_token);
		try {
			User user = um.showUserById(uid);
			Log.logInfo(user.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
