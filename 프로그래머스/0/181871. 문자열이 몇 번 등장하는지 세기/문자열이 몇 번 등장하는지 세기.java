class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        for(int i=0;i<myString.length();i++){
            String temp=myString.substring(i,myString.length());
            if(temp.startsWith(pat))
                answer++;
        }
        
        return answer;
    }
}