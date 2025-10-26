package classic;

public class Singleton {
    private volatile static Singleton uniqueInstance;

    // other instance variables

    private Singleton() {}

    public static Singleton getInstance() {
        // DCL (Double-Checked Locking)
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    // other methods
}
