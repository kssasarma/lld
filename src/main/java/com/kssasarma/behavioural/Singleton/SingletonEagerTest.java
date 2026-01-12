package main.java.com.kssasarma.behavioural.Singleton;

public class SingletonEagerTest {
    public static void main(String[] args) {
        SingletonEager instance1 = SingletonEager.getEagerInstance();
        SingletonEager instance2 = SingletonEager.getEagerInstance();

        System.out.print(instance1.hashCode());
        System.out.print(instance2.hashCode());

        // Verify that both instances are the same
        if (instance1 == instance2) {
            System.out.println("Both instances are the same. Singleton pattern works!");
        } else {
            System.out.println("Instances are different. Singleton pattern failed.");
        }
    }
}