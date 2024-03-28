package lab5;

public class Task {
    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingletonCopy = LazySingleton.getInstance();
        assert lazySingletonCopy == lazySingleton;
        SingletonClass singletonClass = SingletonClass.getInstance();
        SingletonClass singletonClassCopy = SingletonClass.getInstance();
        assert singletonClassCopy == singletonClass;
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        SingletonEnum singletonEnumCopy = SingletonEnum.INSTANCE;
        assert singletonEnum == singletonEnumCopy;
    }
}
