package codej.programmers.demo.level1;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumber {

    public static int solution(int n){
        int answer =0;

        boolean[] sosu = new boolean[n+1];

        Arrays.fill(sosu,true);

        for(int i=2; i<=Math.sqrt(n); i++) {
            if (sosu[i] == true) {
                for (int j = i; i * j <= n; j++) {
                    sosu[i * j] = false;
                }
            }
        }
            for(int i=2; i<=n; i++){
                if(sosu[i] == true){
                    answer++;
                }
            }


        return answer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(PrimeNumber.solution(n));
    }
}
