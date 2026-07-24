class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int temp1,temp2;
        temp1=Integer.parseInt(Integer.toString(a)+Integer.toString(b));
        temp2=2*a*b;
        answer=temp1>=temp2?temp1:temp2;
        return answer;
    }
}