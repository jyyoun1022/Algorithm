package codej.programmers.demo.string;

import java.util.Scanner;

public class 문자열_다루기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean answer = true;
        int length = str.length();
        if(length ==4 || length ==6){
            answer = true;
        }else {
            answer = false;
        }
        for(int i =0; i<length; i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                answer = false;
            }
        }
        System.out.println(answer);

    }
}
