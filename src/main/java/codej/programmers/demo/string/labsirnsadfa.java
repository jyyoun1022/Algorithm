package codej.programmers.demo.string;

import java.util.Arrays;

public class labsirnsadfa {
    public static void main(String[] args) {
        int n = 10;
        int answer =0;

        boolean[] prime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            prime[i] = true;
        }
        int root = (int) Math.sqrt(n);
        for (int i = 2; i <= root; i++) {
            System.out.println("i : " + i);
            if (prime[i] == true) {
                for (int j = i; i * j <= n; j++) {
                    System.out.println(j);
                    prime[i * j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true) {
                answer++;
            }
        }
        System.out.println("answer : "+answer);
    }
}
