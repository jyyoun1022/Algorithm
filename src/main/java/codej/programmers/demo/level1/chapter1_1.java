package codej.programmers.demo.level1;

import java.util.Scanner;


public class chapter1_1 {

    public static int solution(int n){
        int sum =0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(chapter1_1.solution(n));
    }
}
