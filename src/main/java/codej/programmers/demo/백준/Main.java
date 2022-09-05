package codej.programmers.demo.백준;

import java.math.BigInteger;

public class Main {

    static int gcd (int a, int b){
        while(b != 0){
            int r =a%b;
            a=b;
            b=r;
        }
        return a;
    }
    public static void main(String[] args) {
        int answer = gcd(15, 10);
        int answer2 = BigInteger.valueOf(15).gcd(BigInteger.valueOf(10)).intValue();
        System.out.println(answer);
        System.out.println(answer2);
        int lcm =0;
        lcm = 2*3/gcd(2,3);
        System.out.println(lcm);


    }
}
