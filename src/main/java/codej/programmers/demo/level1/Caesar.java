package codej.programmers.demo.level1;

import java.util.Scanner;

public class Caesar {

    public static String solution(String s, int n){
        String answer ="";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isUpperCase(ch)){
                answer += (char)((ch+n-'A')%26+'A');
            }else if(Character.isLowerCase(ch)){
                answer += (char)((ch+n-'a')%26 +'a');
            }else{
                answer += ch;
            }
        }


        return answer;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(Caesar.solution(s,n));

    }
}
