//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SingletonLazy singletonEager2 = SingletonLazy.getInstance();
        SingletonLazy singletonEager1 = SingletonLazy.getInstance();
        SingletonLazy singletonEager3 = SingletonLazy.getInstance();
    }
}