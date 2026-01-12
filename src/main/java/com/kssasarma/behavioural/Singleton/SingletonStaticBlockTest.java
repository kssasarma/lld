package main.java.com.kssasarma.behavioural.Singleton;

public class SingletonStaticBlockTest {
    public static void main(String[] args) {
        SingletonStaticBlock instance1 = SingletonStaticBlock.getStaticBlockInstance();
        SingletonStaticBlock instance2 = SingletonStaticBlock.getStaticBlockInstance();

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        // Verify that both instances are the same
        if (instance1 == instance2) {
            System.out.println("Both instances are the same. Singleton pattern works!");
        } else {
            System.out.println("Instances are different. Singleton pattern failed.");
        }
    }
}
