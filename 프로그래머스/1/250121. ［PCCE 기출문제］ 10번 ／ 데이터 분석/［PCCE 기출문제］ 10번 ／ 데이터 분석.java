import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = new int[data.length][4];
        
        int ext_index = findIndex(ext);
        int sort_by_index = findIndex(sort_by);
        
        for(int i=0; i< data.length; i++){
            for(int j=i+1; j < data.length; j++){
              if(data[i][sort_by_index] > data[j][sort_by_index]){
                  int[] tempArray = data[i];
                  data[i] = data[j];    
                  data[j] = tempArray;
              }   
            }
        }
        
        int[][] newArray = new int[data.length][4];
        int index = 0;
        for(int i=0; i< data.length; i++){
            if(data[i][ext_index] < val_ext){
                newArray[index++] = data[i];
            }
        }
      
        
        return   Arrays.copyOf(newArray, index);
    }
    
    public int findIndex(String str){
        int index=0;
        if(str.equals("code")){
            index=0;
        }else if(str.equals("date")){
            index=1;
        }else if(str.equals("maximum")){
            index=2;
        }else if(str.equals("remain")){
            index=3;
        }
        return index;
    }
}