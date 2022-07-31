package codej.programmers.demo.level1;

import java.util.Scanner;

public class Phone {

    public static String solution(String phone_number){

        String answer = "";

        for(int i=0; i<phone_number.length(); i++){
            if(i < phone_number.length()-4){
                answer += "*";
            }else {
                answer += phone_number.charAt(i);
            }
        }

        return answer;

    }

    /**
     * 만약 예를 들어 번호에 "-" 가 들어가있을 때는 ?
     */
    public static String solution2(String phone_number){
        String answer ="";
        for(int i=0; i<phone_number.length(); i++){
            int last = phone_number.lastIndexOf("-");
            if(i < last+1){
                answer += "*";
            }else{
                answer += phone_number.charAt(i);
            }
        }


        return answer;
    }

    /**
     * 배열로 풀어보기
     */
    public static String solution3(String phone_number){
        char[] ch = phone_number.toCharArray();

        for(int i =0; i<ch.length-4; i++){
            ch[i] = '*' ;
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(Phone.solution3(str));
    }
}
