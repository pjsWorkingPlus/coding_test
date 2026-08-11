class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] strArr=myString.split("");
        
        for(int i=0;i<strArr.length;i++){
            if(strArr[i].equals("a")){
                strArr[i]="A";
            }
            else if(strArr[i].equals("A")){}
            else{
                strArr[i]=strArr[i].toLowerCase();
            }
            answer+=strArr[i];
        }
        
        return answer;
    }
}