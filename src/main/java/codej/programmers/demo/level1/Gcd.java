package codej.programmers.demo.level1;

import java.util.Arrays;
import java.util.Scanner;
public class Gcd {

    public static int[] solution(int n , int m){
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        int r = 0;

        while(min != 0){
            r = max % min;
            max=min;
            min=r;
        }
        int gcd = n*m/max;

        System.out.println(" 최대 공약수 : "+max);
        System.out.println(" 최소 공배수 : "+n*m/max);

        return null;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(Gcd.solution(n,m));
    }
}
