package codej.programmers.demo.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ternary {
    public static void main(String[] args) {

        //N진법 -> 10진법
        //Integer.parseInt(i,N);

        //10진법 -> N진법
//        Integer.toBinaryString(number); -2진법
//        Integer.toOctalString(number); - 8진법
//        Integer.toHexString(number);  -16진법

        //자연수n이 매개변수로 주어진다.
        int n =45;
        int answer =0;
        //n을 3진법상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return
        String base ="";
        StringBuilder sb = new StringBuilder();
        while(n != 0){
            base = (n%3)+base;
            n/=3;
        }
        System.out.println(base);
        base = sb.append(base).reverse().toString();
        answer = Integer.parseInt(base, 3);
        System.out.println(answer);
    }
}
