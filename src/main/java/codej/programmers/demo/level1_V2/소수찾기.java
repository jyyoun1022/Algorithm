package codej.programmers.demo.level1_V2;

import java.util.Arrays;

public class 소수찾기 {
    public int solution(int n){
        int answer =0;

        boolean[] prime = new boolean[n + 2];
        for(int i=2; i<=n; i++){
            prime[i] =true;//true는 회색
        }

        //제곱근 구하기
        int root = (int) Math.sqrt(n);

        for(int i=2; i<=root; i++){//2~루트n 까지검사
            if(prime[i] == true){
                for(int j=i; i*j <=n; j++){//그 배수들은 전부 false로 초기화(배수는 소수가 아니다.)
                  prime[i*j] =false;
                }
            }
        }
        for(int i=2; i<=n; i++){
            if(prime[i] ==true){
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 10;
        소수찾기 sol = new 소수찾기();
        System.out.println(        sol.solution(n)
        );
    }
}
