import java.util.*;
/*

*/

class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> hash = new HashMap<>();
        for(int num:nums){
            hash.put(num, hash.getOrDefault(num, 0)+1);
        }
    
        
        return (hash.size() < nums.length/2)?hash.size():nums.length/2;
    }
}