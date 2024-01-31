package bettercode.v4;

public class Main {
    public static void main(String[] args) {
        Product p = Product.getBuilder()
                .setName("Iphone")
                .setDesc("This is an Iphone")
                .build();

        System.out.println(p);
    }
}
