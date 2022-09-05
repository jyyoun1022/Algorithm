package codej.programmers.demo.level1_V2;

public class 약수의개수와덧셈 {
    public int solution(int left,int right){
     int answer =0;
     for(int i=left; i<=right; i++){
         //제곱근인 경우 약수의 개수가 홀수
         if(i % Math.sqrt(i)==0){
             answer -= i;
         }else{
             answer += i;
         }
     }
     return answer;
    }
    public static void main(String[] args) {
        int left =13;
        int right =17;
        약수의개수와덧셈 sol = new 약수의개수와덧셈();
        System.out.println(sol.solution(left,right)
);
    }
}
