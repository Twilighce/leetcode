/*
public static int rob(int[] nums) 
    {
        int ifRobbedPrevious = 0;   // max monney can get if rob current house
        int ifDidntRobPrevious = 0; // max money can get if not rob current house
        
        // We go through all the values, we maintain two counts, 1) if we rob this cell, 2) if we didn't rob this cell
        for(int i=0; i < nums.length; i++) 
        {
            // If we rob current cell, previous cell shouldn't be robbed. So, add the current value to previous one.
            int currRobbed = ifDidntRobPrevious + nums[i];
            
            // If we don't rob current cell, then the count should be max of the previous cell robbed and not robbed
            int currNotRobbed = Math.max(ifDidntRobPrevious, ifRobbedPrevious); 
            
            // Update values for the next round
            ifDidntRobPrevious  = currNotRobbed;
            ifRobbedPrevious = currRobbed;
        }
        
        return Math.max(ifRobbedPrevious, ifDidntRobPrevious);
    }

*/

public int rob(int[] nums) {
    int robThis = 0;
    int notRobThis = 0;

    for(int i = 0; i < nums.length; i++) {
        int temp = robThis;
        robThis = notRobThis + nums[i];
        notRobThis = Math.max(temp, notRobThis);
    }

    return Math.max(robThis, notRobThis);
}


