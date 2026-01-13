package com.kssasarma.creational.abstractfactory;

public class NetworkResponse implements IResponse {
	@Override
	public String getResponse() {
		return "Network is Running";
	}

}
