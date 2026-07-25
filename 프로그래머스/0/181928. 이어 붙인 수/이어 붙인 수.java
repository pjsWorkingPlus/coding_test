import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String oddStr="",evenStr="";
        
        for(int i:num_list){
            if(i%2==0)
                evenStr+=Integer.toString(i);
            else
                oddStr+=Integer.toString(i);
        }
        answer=Integer.parseInt(evenStr)+Integer.parseInt(oddStr);
        
        
        return answer;
    }
}