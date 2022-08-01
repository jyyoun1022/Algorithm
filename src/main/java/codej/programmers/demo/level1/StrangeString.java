package codej.programmers.demo.level1;

import java.util.Scanner;

public class StrangeString {

    public static String solution(String s){
        String answer ="";
        int count =0;
        String[] list = s.split("");

        for (String str : list) {
            count = str.contains(" ")? 0 : count+1;
            answer += (count %2 == 0) ? str.toLowerCase() : str.toUpperCase();

        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(StrangeString.solution(s));
    }
}
