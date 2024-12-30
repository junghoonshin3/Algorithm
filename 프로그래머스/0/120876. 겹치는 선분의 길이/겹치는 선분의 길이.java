import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] array = new int[201];
        
        for(int i = 0; i < lines.length; i++){
            int s = lines[i][0] + 100;
            int e = lines[i][1] + 100;
            
           for(int t = s; t < e; t++){
               array[t] += 1;
           }
        }
        
        for(int a : array){
            if(a > 1){
                answer++;
            }
        }
        
        
        return answer;
    }
}