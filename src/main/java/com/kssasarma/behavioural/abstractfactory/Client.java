package com.kssasarma.behavioural.abstractfactory;

public class Client {

	private IService service;
	private IResponse response;

	public Client(IDataSourceAbstractFactory factory) {
		this.service = factory.createService();
		this.response = factory.createResponse();
	}
	
	public void communicate() {
		if(service != null && response != null) {
			System.out.println("Service: " + service.runService());
			System.out.println("Response: " + response.getResponse());
		}
	}

}
