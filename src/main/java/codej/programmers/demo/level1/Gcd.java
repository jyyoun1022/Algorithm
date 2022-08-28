package codej.programmers.demo.level1;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class Gcd {

    public static int[] solution(int n , int m){
        int gcd;
        int lcm;
        gcd = BigInteger.valueOf(n).gcd(BigInteger.valueOf(m)).intValue();
        lcm = n*m/gcd;


        System.out.println(" 최대 공약수 : "+gcd);
        System.out.println(" 최소 공배수 : "+lcm);
        System.out.println(" 리턴 값 : "+ Arrays.stream(new int[]{gcd,lcm}).toArray().toString());
        return new int[]{gcd,lcm};

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(Gcd.solution(n,m));
    }
}
