public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        
        for (int i = 0; i < nums.length; i++) {
            int a = target - nums[i];
            if (map.get(a) != null && map.get(a) != i) {
                result[0] = i;
                result[1] = map.get(a);
                return result;
            } 
        }
        return result;
    }
}