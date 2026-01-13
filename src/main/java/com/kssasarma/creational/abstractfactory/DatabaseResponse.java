package com.kssasarma.creational.abstractfactory;

public class DatabaseResponse implements IResponse {
	@Override
	public String getResponse() {
		return "Database is Running";
	}

}
