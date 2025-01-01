import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> list = new ArrayList<>();
        Map<String, Integer> terms_map = new HashMap<>();
        for(String term:terms){
            String[] temp = term.split(" ");
            terms_map.put(temp[0], Integer.parseInt(temp[1]));
        }
        String[] today_arr = today.split("\\.");
        int today_year = Integer.parseInt(today_arr[0]) * 12 * 28;
        int today_month = Integer.parseInt(today_arr[1]) * 28;
        int today_date = Integer.parseInt(today_arr[2]);
        int total_today_date = today_year+today_month+today_date;
        for(int i =0; i< privacies.length; i++){
            String[] temp = privacies[i].split(" ");
            String[] privacy_date = temp[0].split("\\.");
            int year = Integer.parseInt(privacy_date[0]) * 12 * 28;
            int month =Integer.parseInt(privacy_date[1]) * 28;
            int date = Integer.parseInt(privacy_date[2]);
            String type = temp[1];
            if(terms_map.containsKey(type)){
              int total_date =  year + month + date + terms_map.get(type) * 28;
                if(total_today_date >= total_date){
                    list.add(i+1);
                }
            }
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}