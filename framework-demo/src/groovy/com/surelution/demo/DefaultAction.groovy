/**
 * 
 */
package com.surelution.demo

import com.surelution.whistle.core.NewsAttribute
import com.surelution.whistle.push.UserInfo;

/**
 * 这个例子演示如何使用whistle框架<br/>
 * 
 * @author <a href="mailto:guangzong.syu@gmail.com">guangzong</a>
 *
 */
class DefaultAction extends DemoBaseAction {

	/* (non-Javadoc)
	 * @see com.surelution.whistle.core.BaseAction#accept()
	 */
	@Override
	public boolean accept() {
		true
	}

	/* (non-Javadoc)
	 * @see com.surelution.whistle.core.BaseAction#execute()
	 */
	@Override
	public void execute() {
		
		//取得项目的web根路径的方式
		println rootPath
		
		//取得service的方式
		def testService = loadService("testService")
		
		//调用service的方式
		testService.serviceMethod()
		
		//在Action内，包含一个subscriber变量，是当前用户的信息
		
		//取得注册用户的详细信息
		def userInfo = UserInfo.loadUserInfo(subscriber.openId)
		
		//构建图文消息
		def na = new NewsAttribute()
		na.add("hello", "hello ${userInfo.nickname}", userInfo.headImgUrl, "http://www.baidu.com/")
		
		//发送图文消息
		put(na)
	}

}
