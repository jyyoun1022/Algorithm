package codej.programmers.demo.level1;

import java.util.Scanner;

public class Harshad {

    public static boolean solution(int x){
        boolean answer = true;
        int arr =x;
        int sum =0;

        while(arr>0){
            sum += arr % 10;
            arr /= 10;
        }

        answer = (x % sum ==0)? true : false;

        return answer ;

    }

    /**
     * String 사용 했을 때
     */
    public static boolean solution2(int x){
        String[] temp = String.valueOf(x).split("");
        int sum =0;
        boolean answer =true;
        for (String s : temp) {
            sum += Integer.parseInt(s);
        }

        answer = (x % sum ==0) ? true : false;

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(Harshad.solution2(x));
    }

}
