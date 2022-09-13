package codej.programmers.demo.level1_V2;

import java.util.ArrayList;

public class 없는숫자더하기 {
    public int solution(int[] numbers){
        int answer = 45;

        for(int i=0; i< numbers.length; i++){
            answer -= numbers[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        없는숫자더하기 sol = new 없는숫자더하기();
        System.out.println(        sol.solution(numbers)
        );
    }
}
