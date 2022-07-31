package codej.programmers.demo.string;

import java.util.Scanner;

public class 회문 {
    public static String solution(String str){
        String answer="YES";
        str = str.toUpperCase();
        char[] s = str.toCharArray();

        int lt = 0;
        int rt = str.length()-1;

        while(lt<rt){
            if(s[lt] == s[rt]){
                lt++;
                rt--;
            }else {
                answer = "NO";
                break;
            }
        }
        return answer;
    }

    public static String solution2(String str){
        String answer = "NO";

        String temp = new StringBuilder(str).reverse().toString();

        if(str.equalsIgnoreCase(temp)){
            answer ="YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
//        System.out.println(회문.solution(str));
        System.out.println(회문.solution2(str));

    }
}
