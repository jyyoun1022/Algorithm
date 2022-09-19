package codej.programmers.demo.level1_V2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 모의고사 {
    public int[] solution(int[] answers){
        //가장 많은 문제를 맞힌 사람을 return

        int[] supo1 = {1,2,3,4,5};
        int[] supo2 = {2,1,2,3,2,4,2,5};
        int[] supo3 = {3,3,1,1,2,2,4,4,5,5};

        List<Integer> correctList = new ArrayList<>();
        //맞춘 사람 리스트에 0으로 세팅
        for(int i=0; i<= 2; i++){
            correctList.add(0);
        }

        for(int i=0; i< answers.length; i++){

            if(answers[i] == supo1[i%5]){
                correctList.set(0,correctList.get(0)+1);
            }
            if(answers[i] == supo2[i%8]){
                correctList.set(1, correctList.get(1)+1);
            }
            if(answers[i] == supo3[i%10]){
                correctList.set(2, correctList.get(2)+1);
            }
        }
        int max = Collections.max(correctList);
        List<Integer> returnList = new ArrayList<>();

        for(int i= 0; i < correctList.size(); i++){
            if(max == correctList.get(i)){
                returnList.add(i);
            }
        }
        int[] answer = new int[returnList.size()];

        for(int i=0; i< returnList.size(); i++){
            answer[i] = returnList.get(i)+1;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
    public static void main(String[] args) {
        int[] answers = {1,3,2,4,2};
        모의고사 sol = new 모의고사();
        System.out.println(        sol.solution(answers)
        );
    }
}
