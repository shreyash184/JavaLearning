import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(f());
    }

    static int f(){
        String[][] studentMarks = {
                {"Bob", "87"},
                {"Mike", "35"},
                {"Bob", "52"},
                {"Jason", "35"},
                {"Mike", "55"},
                {"Jessica", "99"}
        };

        int maxAvg = Integer.MIN_VALUE;

        HashMap<String, Integer> totalScore = new HashMap<>();
        HashMap<String, Integer> count = new HashMap<>();

        for(String [] s : studentMarks){
            String name = s[0];
            Integer score = Integer.parseInt(s[1]);

            totalScore.put(name, totalScore.getOrDefault(name, 0) + score);
            count.put(name, count.getOrDefault(name, 0) + 1);
        }

        for(String name : totalScore.keySet()){
            int score = totalScore.getOrDefault(name, 0);
            int cnt = count.get(name);

            int avg = score / cnt;

            if(avg > maxAvg){
                maxAvg = avg;
            }
        }
        return maxAvg;
    }
}