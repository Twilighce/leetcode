/*
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

*/

// Sliding Window
class Solution {
    public int lengthOfLongestSubstring(String s) {
    	if (s == null || s.length() == 0)
    		return 0;

    	int n = s.length();
    	Set<Character> set = new HashSet<>();
    	int result = 0, i = 0, j = 0;
    	while(i < n && j < n) {
    		if(!set.contains(s.charAt(j))) {
    			set.add(s.charAt(j++));
    			result = Math.max(result, j - i);
    		} else {
    			set.remove(s.charAt(i--));
    		}
    	}
    	return result;
    }
}

//Sliding Window Optimized
//Using HashMap
/*class Solution {
	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0) 
			return 0;

		
	}
}*/