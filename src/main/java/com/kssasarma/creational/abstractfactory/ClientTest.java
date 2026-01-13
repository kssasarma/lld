package com.kssasarma.creational.abstractfactory;

public class ClientTest {
	public static void main(String[] args) {

		IDataSourceAbstractFactory networkFactory = new NetworkFactory();
		Client networkClient = new Client(networkFactory);
		System.out.println("Communicating using Network Factory:");
		networkClient.communicate();

		System.out.println();

		// Using Database Factory
		IDataSourceAbstractFactory databaseFactory = new DatabaseFactory();
		Client databaseClient = new Client(databaseFactory);
		System.out.println("Communicating using Database Factory:");
		databaseClient.communicate();
	}

}
