package codej.programmers.demo.level1_V2;

public class 약수의합 {
    public int solution(int n){
        int answer =0;//약수의 합 담을 통

        for(int i=1; i<=n/2; i++){
            if(n%i==0){
                System.out.println(i);
                answer += i;
            }
        }

        return answer+n;
    }
    public static void main(String[] args) {
        int n =12;
        약수의합 sol = new 약수의합();
        System.out.println(        sol.solution(n)
        );
    }
}
