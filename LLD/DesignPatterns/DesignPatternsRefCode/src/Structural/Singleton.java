package Structural;


enum SingletonEnum{
    INSTANCE;

    public void doSomthing(){
        System.out.println("Enum Singleton");
    }
}


class BillPughSingleton{
    private BillPughSingleton(){
        System.out.println("Bill Pugh Singleton");
    }

    private static class InnerSingleton{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return InnerSingleton.INSTANCE;
    }
}

public class Singleton {

    public static void main(String[] args) {
//        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        singletonEnum.doSomthing();
    }
}
