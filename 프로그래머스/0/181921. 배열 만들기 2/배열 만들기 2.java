import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        
        List<Integer> matchedList=new ArrayList<>();
        
        for(int i=l;i<=r;i++){
            String numStr=Integer.toString(i);
            if(numStr.replaceAll("[50]","").isEmpty())
                matchedList.add(i);
        }
        if(matchedList.isEmpty())
            matchedList.add(-1);
        return matchedList.stream().mapToInt(Integer::intValue).toArray();
    }
}