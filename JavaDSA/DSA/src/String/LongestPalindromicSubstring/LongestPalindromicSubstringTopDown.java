package String.LongestPalindromicSubstring;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromicSubstringTopDown {
    List<List<Integer>> dp = new ArrayList<>(1005);
    String ans = "";
    Integer maxLen = -1;
    public Integer recur(int i, int j, String s){
        if(i > j){
            return 1;
        }
        if(s.charAt(i) != s.charAt(j)){
            return 0;
        }

        if(dp.get(i).get(j) != -1){
            return dp.get(i).get(j);
        }

        dp.get(i).set(j, recur(i+1, j-1, s));

        if(dp.get(i).get(j) == 1){
            int currMax = j-i+1;
            if(currMax > maxLen){
                maxLen = currMax;
                ans = s.substring(i, j+1);
            }
        }

        return dp.get(i).get(j);
    }

    public String longestPalindrome(String s){
        int rows = s.length();
        int cols = s.length();


        for(int i=0;i<=rows;i++){
            dp.add(new ArrayList<>(1005));
            for(int j=0;j<=cols;j++){
                dp.get(i).add(-1);
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=i;j<cols;j++){
                int ignore = recur(i, j, s);
            }
        }

        return ans;
    }
}
