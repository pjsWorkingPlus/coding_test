import java.util.PriorityQueue;
import java.util.Collections;
import java.util.ArrayDeque;
import java.util.Queue;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        //우선 순위큐
        PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
        //큐
        Queue<Process> q=new ArrayDeque<>();
        //location에 위치한 숫자보다 큰 숫자들의 개수
        int overCnt=0;
        //location에 위치한 숫자
        int targetNum=priorities[location];
        int loc=location;
        int N=priorities.length;
        int tempP;
        boolean tempF;
        //선택된 프로세스만 flag=true 하여 큐 초기화
        for(int i=0;i<N;i++){
            tempP=priorities[i];
            pq.offer(tempP);
            tempF=(i==location)?true:false;
            q.offer(new Process(tempP,tempF));
            if(tempP>targetNum){
                overCnt+=1;
            }
        }
        System.out.println(q);
        while(overCnt>0){
            
            if(q.peek().p>targetNum&&q.peek().p==pq.peek()){
                answer++;
                q.poll();
                pq.poll();
                overCnt--;
            }
            else{
                q.add(q.poll());
            }
            // System.out.println(q);
        }
       
        while(true){
            System.out.println(q);
            if(q.peek().flag){
                answer++;
                break;
            } 
            else if(q.peek().p<targetNum){
                q.offer(q.poll());
            }
            else{
                answer++;
                q.poll();
            }
        }
        
        return answer;
    }
    class Process implements Comparable<Process>{
        int p;
        boolean flag;
        
        Process(int p,boolean flag){
            this.p=p;
            this.flag=flag;
        }
        
        public int compareTo(Process other){
            return Integer.compare(this.p,other.p);
        }
        public String toString(){
            return "<p:"+p+" flag:"+flag+">";
        }
    }
}