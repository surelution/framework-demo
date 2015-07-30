package com.surelution.demo

import java.util.Date;

class KeyedMessage {

    static constraints = {
		key unique:true
    }
	
	static mapping = {
		message length:1024
		key column:"_key"
	}
	
	String key
	String message
	String description
	Date dateCrated
}
