/*class Solution {
    public boolean judgeCircle(String moves) {
        boolean isCircle = false;
        if(moves == null || moves.length() == 0) {
        	isCircle = true;
        	return isCircle;
        }

        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;

        for(int i = 0; i < moves.length(); i++) {
        	if(moves.charAt(i) == 'U') {
        		up++;
        	} else if(moves.charAt(i) == 'D') {
        		down++;
        	} else if(moves.charAt(i) == 'L') {
        		left++;
        	} else {
        		right++;
        	}
        }

        if(up == down && left == right) {
        	isCircle = true;
        }

        return isCircle;
    }
}*/

class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (char ch : moves.toCharArray()) {
            if (ch == 'U') y++;
            else if (ch == 'D') y--;
            else if (ch == 'R') x++;
            else if (ch == 'L') x--;
        }
        return x == 0 && y == 0;
    }
}