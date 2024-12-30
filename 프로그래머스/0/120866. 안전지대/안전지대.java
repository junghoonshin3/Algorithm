class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] newBoard = new int[board.length + 2][board.length + 2];
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                newBoard[i+1][j+1] = board[i][j];
            }
        }
        
        for(int i = 1; i < newBoard.length; i++){
            for(int j = 1; j < newBoard.length; j++){
                if(newBoard[i][j] == 1){
                    for(int k = i - 1; k <= i + 1; k++){
                        for(int m = j - 1; m <= j + 1; m++){
                            if(newBoard[k][m]!=1){
                                newBoard[k][m] = 2;
                            }
                        }
                    }
                }
            }
        }
        
        for(int i = 1; i < newBoard.length-1; i++){
            for(int j = 1; j < newBoard.length-1; j++){
                if(newBoard[i][j] == 0){
                    answer ++;
                }
            }
        }
        
        
        return answer;
    }
}

    