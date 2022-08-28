package codej.programmers.demo.level1;

import java.util.Scanner;

public class Math_sqrt {
    public static void main(String[] args) {
        int a = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("임의의 양의 정수 n을 입력해주세요.");
        int n = sc.nextInt();

        double sqrt = Math.sqrt(5);//11.0
        int answer =0;
        if(Math.pow(sqrt,2) == n){
            answer = (int)Math.pow(sqrt+1,2);
        }else {
            answer =-1;
        }
        System.out.println(answer);
    }
}
