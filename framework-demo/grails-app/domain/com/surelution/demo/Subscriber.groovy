package com.surelution.demo


class Subscriber {

    static constraints = {
    }
	
	static mapping = {
		openId unique:true
	}
	
	String openId
	Date dateCrated
}
