package codej.programmers.demo.level1;

import java.util.LinkedList;

public class 숫자_문자열과_문자열 {
    public int solution(String s){
        //알파벳을 숫자로 치환 하는 문제
        //정확성 테스트 : 10초

        int answer =0;
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0; i <= 9; i++){
            s = s.replace(arr[i], String.valueOf(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
    public static void main(String[] args) {
        String s = "one4seveneight";
        숫자_문자열과_문자열 sol = new 숫자_문자열과_문자열();
        sol.solution(s);
    }
}
