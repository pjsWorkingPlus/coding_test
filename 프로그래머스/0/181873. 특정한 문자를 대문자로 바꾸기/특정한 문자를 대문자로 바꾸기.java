class Solution {
    public String solution(String my_string, String alp) {
        String answer;
        char c=alp.charAt(0);

        char d=Character.toUpperCase(c);
        answer=my_string.replace(c,d);
        
        return answer;
    }
}