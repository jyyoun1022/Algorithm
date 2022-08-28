package codej.programmers.demo.level1;

import java.util.*;

public class Desc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        char[] chars = new StringBuilder(String.valueOf(n)).reverse().toString().toCharArray();
        System.out.println(chars.length);
        int[] arr = new int[chars.length];

        for(int i=0; i<arr.length; i++){
            arr[i] = chars[i]-48;
        }
        System.out.println(Arrays.toString(arr));

    }
}
