package org.example;

import java.util.Arrays;
import java.util.Set;

class Solution {
    int last_stone;
    public boolean isArrayContainsValue(int[] array, int targetValue) {
        for (int value : array) {
            if (value == targetValue) {
                return true;
            }
        }
        return false;
    }
    public boolean f(int[] stones, int stone, int k, Set<Integer> s){
        if(stone >= last_stone)return last_stone == stone;
//        System.out.println(Arrays.asList(stones).contains(stone+k-1));

        boolean firstOption = (k > 1 && s.contains(stone+k-1)) && f(stones, stone+k-1, k-1, s);
        boolean secondOption = (s.contains(stone+k)) && f(stones, stone+k, k, s);
        boolean thirdOption = (s.contains(stone+k+1)) && f(stones, stone+k+1, k+1, s);

        return (firstOption || secondOption || thirdOption);
    }

    public boolean canCross(int[] stones) {
        last_stone = stones[stones.length-1];
        Set<Integer> s = new HashSet<>();
        for(int n : stones){
            s.add(n);
        }
        if(s.contains(stones[0]+1)){
            return f(stones, stones[0]+1, 1, s);
        }else{
            return false;
        }
    }
}