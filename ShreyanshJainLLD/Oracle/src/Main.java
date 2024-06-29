import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static int square(int val){
        return val * val;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6};

        for(int i=0;i<6;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        Arrays.parallelSetAll(arr, i -> square(arr[i]));

        for(int i=0;i<6;i++){
            System.out.print(arr[i] + " ");
        }
    }
}