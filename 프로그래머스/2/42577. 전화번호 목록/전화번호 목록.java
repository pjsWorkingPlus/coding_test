import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Set<String> numSet = new HashSet<>();
        
        // 가장 짧은 길이 번호 저장
        int minLen=Integer.MAX_VALUE;
        for(String numStr:phone_book){
            if(numStr.length()<minLen)
                minLen=numStr.length();
        }
        
        // 기준이 되는 접두어와 매칭 될 수 있는 모든 경우의 수 set에 저장
        for(String numStr:phone_book){
            // 최소길이~원래길이 까지 substring들 저장
            for(int i=minLen;i<=numStr.length();i++)
                numSet.add(numStr.substring(0,i-1));
        }
        
        for(String numStr:phone_book){
            if(numSet.contains(numStr))
                return false;
        }
        
        return answer;
    }
}