package codej.programmers.demo.level2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class N개의_최소공배수 {
    static int gcd(int a,int b){
        while(b != 0){
            int r = a%b;
            a=b;

            b=r;
        }
        return a;
    }
    static  int lcm (int a,int b){
        return  a*b/gcd(a,b);
    }
    public int solution(int[] arr){
        int answer =1;
        for(int i=0; i<arr.length; i++){
            int g = gcd(arr[i],answer);
            answer = arr[i] * answer /g;

        }
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        int[] arr ={2,6,8,14};
        N개의_최소공배수 sol = new N개의_최소공배수();
        sol.solution(arr);
    }
}
