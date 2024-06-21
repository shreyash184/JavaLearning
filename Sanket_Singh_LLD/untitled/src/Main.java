//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int [] a = {3, 6, 2, 3, 5};

        int i=0, j=4;
        int sum1 = 0, sum2 = 0;
        int x = 0;
        while(i <= j){
            if(x % 2 == 0){
                // sum1 chance
                if(a[i] % 2 == 0){
                    sum1 += a[i];
                    i++;
                }else{
                    sum1 += a[j];
                    j--;
                }
            }else{
                //sum2 chance
                if(a[i] %2 == 0){
                    sum2 += a[i];
                    i++;
                }else{
                    sum2 += a[j];
                    j--;
                }
            }
            x++;
        }
        System.out.println(sum1 - sum2);
    }
}