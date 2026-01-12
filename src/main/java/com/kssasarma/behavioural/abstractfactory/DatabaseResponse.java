package com.kssasarma.behavioural.abstractfactory;

public class DatabaseResponse implements IResponse {
	@Override
	public String getResponse() {
		return "Database is Running";
	}

}
