package codej.programmers.demo.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Desc {
    public static long solution(long n){

        String str = String.valueOf(n);
        String[] arr = str.split("");

        Arrays.sort(arr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }

        return Long.parseLong(sb.toString());

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Desc.solution(n));
    }
}
