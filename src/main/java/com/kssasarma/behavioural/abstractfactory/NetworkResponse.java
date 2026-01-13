package com.kssasarma.behavioural.abstractfactory;

public class NetworkResponse implements IResponse {
	@Override
	public String getResponse() {
		return "Network is Running";
	}

}
