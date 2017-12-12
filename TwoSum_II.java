
 class Solution {  
    public int[] twoSum(int[] numbers, int target) { 
        if(numbers == null || numbers.length == 0) {
            return null;
        }
        int[] result = new int[2];
        
        int i = 0;
        int j = numbers.length - 1;
        
        while(i < j) {
            int currentSum = numbers[i] + numbers[j];  
            if(currentSum < target) {
                ++i;
            } else if(currentSum > target) {
                --j;
            } else {
                result[0] = i + 1;
                result[1] = j + 1;
                return result;
            }
        }
        
        return null;
    }  
} 
