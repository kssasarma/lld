package main.java.com.kssasarma.behavioural.abstractfactory;

public interface DataSourceAbstractFactory {
    IService createService();
    IResponse createResponse();
}
