package bettercode.v3;

public class Main {
    public static void main(String[] args) {
        Builder b = new Builder();
        b.setName("Iphone");
        b.setDesc("This is an iphone");
        b.setPrice(100);

        Product p = new Product(b);

        System.out.println(p.name);
    }
}
