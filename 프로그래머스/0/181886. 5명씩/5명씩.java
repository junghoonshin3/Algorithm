class Solution {
    public String[] solution(String[] names) {
        String answer = "";
        for(int i =0; i<names.length; i++){
            if(i % 5 == 0){
                answer += names[i]+",";
            }
        }
        return answer.split(",");
    }
}