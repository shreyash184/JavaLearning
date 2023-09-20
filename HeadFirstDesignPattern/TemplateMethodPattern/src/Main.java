import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void display(Duck[] ducks){
        for(int i=0;i<ducks.length;i++){
            System.out.println(ducks[i]);
        }
    }
    public static void main(String[] args) {

        Duck[] duck = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7)
        };
        display(duck);
        Arrays.sort(duck);
        display(duck);

        Tea  tea = new Tea();

        tea.prepareRecipe();

        Coffee coffee = new Coffee();

        coffee.prepareRecipe();
    }
}
