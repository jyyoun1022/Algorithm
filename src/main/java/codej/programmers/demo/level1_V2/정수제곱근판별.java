package codej.programmers.demo.level1_V2;

public class 정수제곱근판별 {
    public long solution(long n){
        long answer =0 ;
        long sqrt = (long) Math.sqrt(n);

        if(n == sqrt*sqrt){
            answer = (long)Math.pow(sqrt+1,2);
        }else{
            answer = -1;
        }
        return answer;
    }
    public static void main(String[] args) {
      long n =121;
        정수제곱근판별 sol = new 정수제곱근판별();
        System.out.println(        sol.solution(n)
        );
    }
}
