public class SingletonEager {

    public static final SingletonEager singletonEager = new SingletonEager();

    private SingletonEager(){
        System.out.println("The object is created");
    }

    public static SingletonEager getInstance(){
        return singletonEager;
    }
}
