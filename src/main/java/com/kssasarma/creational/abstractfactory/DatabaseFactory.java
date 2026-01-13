package com.kssasarma.creational.abstractfactory;

public class DatabaseFactory implements IDataSourceAbstractFactory {
    @Override
    public IService createService() {
        return new DatabaseService();
    }

    @Override
    public IResponse createResponse() {
        return new DatabaseResponse();
    }
    
}
