import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> players_map = new HashMap<>();
        //해시맵 초기화
        for(int i =0; i<players.length; i++){
            players_map.put(players[i], i);
        }
        for(String calling : callings){
            //불린 사람 등수
            int num = players_map.get(calling);
            //내 앞 등수 사람이름
            String prePlayer = players[num - 1];
            players[num -1] = calling;
            players[num] = prePlayer;
            players_map.put(calling, num - 1);
            players_map.put(prePlayer, num);
        }   
     return players;
    }

}