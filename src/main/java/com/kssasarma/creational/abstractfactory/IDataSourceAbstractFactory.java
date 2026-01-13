package com.kssasarma.creational.abstractfactory;

public interface IDataSourceAbstractFactory {
	IService createService();

	IResponse createResponse();
}
