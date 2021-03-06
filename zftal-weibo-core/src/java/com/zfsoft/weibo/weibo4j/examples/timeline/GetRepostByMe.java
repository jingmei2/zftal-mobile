package com.zfsoft.weibo.weibo4j.examples.timeline;

import com.zfsoft.weibo.weibo4j.Timeline;
import com.zfsoft.weibo.weibo4j.examples.oauth2.Log;
import com.zfsoft.weibo.weibo4j.model.Status;
import com.zfsoft.weibo.weibo4j.model.StatusWapper;
import com.zfsoft.weibo.weibo4j.model.WeiboException;


public class GetRepostByMe {

	public static void main(String[] args) {
		String access_token = args[0];
		Timeline tm = new Timeline();
		tm.client.setToken(access_token);
		try {
			StatusWapper status = tm.getRepostByMe();
			for(Status s : status.getStatuses()){
				Log.logInfo(s.toString());
			}
			System.out.println(status.getNextCursor());
			System.out.println(status.getPreviousCursor());
			System.out.println(status.getTotalNumber());
			System.out.println(status.getHasvisible());
		} catch (WeiboException e) {
			e.printStackTrace();
		}

	}

}
