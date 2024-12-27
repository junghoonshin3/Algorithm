class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
    
        int life = health;
        int successCount = 0; 
        int attackIndex = 0;
        
        for(int i = 1; i <= attacks[attacks.length-1][0]; i++){
            if(i != attacks[attackIndex][0]){
                life += bandage[1];
                successCount ++;
                    if(successCount == bandage[0]){
                        life += bandage[2];
                        successCount= 0;
                    }
                    if(life > health){
                        life = health;
                    }
            }else{
                 life -= attacks[attackIndex][1];
                 successCount = 0;
                 attackIndex++;
                if(life <= 0){
                    return -1;
                }
            }
        }
            
        return life;
    }
}