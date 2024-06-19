public class SingletonLazy {
    private static volatile SingletonLazy lazySingleton;

    private SingletonLazy(){
        System.out.println("The object is created");
    }

    public static SingletonLazy getInstance(){
        if(lazySingleton == null){
            synchronized(SingletonLazy.class){
                if(lazySingleton == null){
                    lazySingleton = new SingletonLazy();
                    return lazySingleton;
                }

            }
        }
        return lazySingleton;
    }
}
