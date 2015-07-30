package com.surelution.demo

import java.util.Date;


class IncomeMessage {

    static constraints = {
		content nullable:true
		msgId nullable:true
    }
	
	static transients = ['createAt']

	String msgId
	String fromUserName
	long createTime
	String content
	String toUserName
	String msgType
	Date dateCrated
	
	public Date getCreateAt() {
		new Date(createTime * 1000)
	}
}
