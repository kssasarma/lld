package com.kssasarma.creational.abstractfactory;

public class NetworkFactory implements IDataSourceAbstractFactory {

	@Override
	public IService createService() {
		return new NetworkService();
	}

	@Override
	public IResponse createResponse() {
		return new NetworkResponse();
	}

}
