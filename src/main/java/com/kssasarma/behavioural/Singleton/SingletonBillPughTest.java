package main.java.com.kssasarma.behavioural.Singleton;

public class SingletonBillPughTest {

    public static void main(String[] args) {
        SingletonBillPugh singleton1 = SingletonBillPugh.getInstance();
        SingletonBillPugh singleton2 = SingletonBillPugh.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same. Singleton works!");
        } else {
            System.out.println("Instances are different. Singleton failed!");
        }
    }
}
