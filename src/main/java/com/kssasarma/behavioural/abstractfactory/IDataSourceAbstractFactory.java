package com.kssasarma.behavioural.abstractfactory;

public interface IDataSourceAbstractFactory {
	IService createService();

	IResponse createResponse();
}
