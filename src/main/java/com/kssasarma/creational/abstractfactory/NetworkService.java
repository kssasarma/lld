package com.kssasarma.creational.abstractfactory;

public class NetworkService implements IService {
	@Override
	public String runService() {
		return "Running Network Service";
	}

}
