class Solution {
    public int[] solution(int[] arr) {
        int[] answer = arr;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0 && arr[i] >= 50){
                answer[i] = arr[i] / 2;
            } else if(arr[i] % 2 != 0 && arr[i] < 50) {
                answer[i] = arr[i] * 2;
            } else{
                continue;
            }
        }
        return answer;
    }
}