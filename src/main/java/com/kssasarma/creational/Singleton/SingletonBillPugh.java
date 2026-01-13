package com.kssasarma.creational.Singleton;

public class SingletonBillPugh {
	private SingletonBillPugh() {
		// private constructor to prevent instantiation
	}

	private static class InnerStaticClass {
		private static final SingletonBillPugh billPughInstance = new SingletonBillPugh();
	}

	public static SingletonBillPugh getInstance() {
		return InnerStaticClass.billPughInstance;
	}
}
