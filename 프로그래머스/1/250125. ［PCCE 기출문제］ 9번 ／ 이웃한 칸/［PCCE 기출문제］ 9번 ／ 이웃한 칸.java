class Solution {
    public int solution(String[][] board, int h, int w) {
        int count = 0;
        String[][] newBoard = new String[board.length+2][board.length+2];
        
        for(int i = 0; i < board.length; i++){
            for(int j=0; j< board.length; j++){
                newBoard[i+1][j+1] = board[i][j];
            }
        }
        
        int nh = h + 1;
        int nw = w + 1;
        String str = newBoard[nh][nw];
        
        //상하좌우 비교
       if(str.equals(newBoard[nh][nw-1])){
           count++;
       }
       if(str.equals(newBoard[nh-1][nw])){
           count++;
       }
       if(str.equals(newBoard[nh][nw+1])){
           count++;
       }
       if(str.equals(newBoard[nh+1][nw])){
           count++;
       }
    
        
        return count;
    }
}