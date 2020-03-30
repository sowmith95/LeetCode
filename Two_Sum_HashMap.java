import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        Map<Integer, Integer> solution = new HashMap<>();
       for(int i = 0; i <= length-1; i++){
           int difference = target - nums[i];
           if(solution.containsKey(difference)){
               return new int[]{solution.get(difference), i};
           }
           solution.put(nums[i],i);
        }
        return null;
    }
}
