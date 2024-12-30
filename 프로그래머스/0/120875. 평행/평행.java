import java.lang.*;
class Solution {
    public int solution(int[][] dots) {

        // 0 - 1, 2-3
        // 0 - 2, 1-3
        // 0 - 3, 1-2
        
        double x1 = (double) dots[0][0];
        double y1 = (double) dots[0][1];

        double x2 = (double) dots[1][0];
        double y2 = (double) dots[1][1];

        double x3 = (double) dots[2][0];
        double y3 = (double) dots[2][1];

        double x4 = (double) dots[3][0];
        double y4 = (double) dots[3][1];

        if (((y3-y1)/(x3-x1)) == ((y4-y2)/(x4-x2)))
            return 1;


        if (((y2-y1)/(x2-x1)) == ((y4-y3)/(x4-x3)))
            return 1;

        if (((y4-y1)/(x4-x1)) == ((y3-y2)/(x3-x2)))
            return 1;

        return 0;
    
    }
}