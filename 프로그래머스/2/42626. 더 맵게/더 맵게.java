import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        //큐ㅜㅇ
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:scoville){
            pq.add(i);
        }
        // System.out.println(pq);
        // 가장 작은 값이 K 이하인 동안 반복
        while(pq.peek()<K&&pq.size()>=2){
            answer++;            
            int temp=pq.poll()+pq.poll()*2;
            
            pq.add(temp);
            if(pq.size()==1&&pq.peek()<K){
                return -1;
            }
        }
        
        return answer;
    }
}