import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer;
        List<String> answerList=new ArrayList<>();
        for(String str:strArr){
            if(str.contains("ad")){
                continue;
            }
            answerList.add(str);
        }
        
        return answer=answerList.toArray(new String[0]);
    }
}