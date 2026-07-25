import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        HashMap<Character, Integer> dir= new HashMap<>(Map.of('w',1,'s',-1,'d',10,'a',-10));

        for(char chr:control.toCharArray()){
            answer+=dir.get(chr);
        }
        
        return answer;
    }
}