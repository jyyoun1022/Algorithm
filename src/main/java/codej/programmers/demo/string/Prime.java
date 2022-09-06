package codej.programmers.demo.string;

import java.util.Arrays;

public class Prime {
    public int solution(int n){
        //int a =10일때, answer = 4;
        int answer =0;

        boolean[] prime =new boolean[n+1];//에스토레스?의체 2부터 a까지 하기위해서 만듬
        for(int i=2; i<=n; i++){
            prime[i] =true;//2부터 a까지 true 로 치환;
        }

        int root = (int) Math.sqrt(n);

        for(int i=2; i<=root; i++){//2부터 a의 제곱근까지의 수를 i로
            if(prime[i] == true){//빈배열이 있으면 false로 있으므로(나는 true에서 소수가 아닌것을 false로 바꿀것이기에 )
                for(int j=i; i*j <= n; j++){//배수들은 소수가 아니다.
                    prime[i*j] =false;
                }
            }
        }
        for(int i=0; i<prime.length; i++){
            if(prime[i]){
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int a =10;
        Prime sol = new Prime();
        System.out.println(sol.solution(a));
    }
}
