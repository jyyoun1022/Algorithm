package codej.programmers.demo.level1;

import java.util.Scanner;

public class Collatz {

    public static long solution(long num) {
        long answer = 0;

        while (answer <= 500) {
            if (num == 1) {
                return answer;
            } else {
                 num= (num % 2 == 0) ? num / 2 : num * 3 + 1;
                answer++;
            }
            return -1;
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Collatz.solution(num));
    }
}


