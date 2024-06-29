public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCupt();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling Water");
    }

    void pourInCupt(){
        System.out.println("Pouring into cup");
    }
}
