package bettercode.v4;

import bettercode.v3.Builder;

public class Product {
    private String name;
    private String desc;
    private int price;
    private String brand;
    private String category;

    private Product(Builder b){
        this.name = b.name;
        this.desc = b.desc;
        if(b.price > 0){
            this.price = b.price;
        }
        this.brand = b.brand;
        this.category = b.category;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return this.name + " " + this.desc;
    }

    public static class Builder {
        private String name;
        private String desc;
        private int price;
        private String brand;
        private String category;

        public Builder(){

        }

        public Product build(){
            return new Product(this);
        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public String getName(){
            return this.name;
        }

        public Builder setDesc(String desc){
            this.desc = desc;
            return this;
        }

        public String getDesc(){
            return this.desc;
        }

        public Builder setPrice(int price){
            this.price = price;
            return this;
        }

        public int getPrice(){
            return this.price;
        }

        public Builder setBrand(String brand){
            this.brand = brand;
            return this;
        }

        public String getBrand(){
            return this.brand;
        }
        public Builder setCategory(String category){
            this.category = category;
            return this;
        }

        public String getCategory(){
            return this.category;
        }
    }

}
