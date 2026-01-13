package com.kssasarma.creational.Singleton;

public class SingletonStaticBlock {
    private static SingletonStaticBlock staticBlockInstance;

    static {
        staticBlockInstance = new SingletonStaticBlock();
    }

    private SingletonStaticBlock() {
    }

    public static SingletonStaticBlock getStaticBlockInstance() {
        return staticBlockInstance;
    }
}