class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mulSum = 1;
        if(num_list.length >= 11){
            for(int i : num_list){
                sum+=i;
        
            }
        }else{
             for(int j : num_list){
                mulSum*=j;
            }
        }
        
        return num_list.length >= 11 ? sum : mulSum;
    }
}