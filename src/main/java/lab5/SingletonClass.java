package lab5;

public class SingletonClass {
    private SingletonClass() {
    }

    private static class InstanceClass {
        private static final SingletonClass INSTANCE = new SingletonClass();
    }

    public static SingletonClass getInstance() {
        return InstanceClass.INSTANCE;
    }
}
