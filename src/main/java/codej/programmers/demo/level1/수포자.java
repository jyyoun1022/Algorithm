package codej.programmers.demo.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 수포자 {
    public static void main(String[] args) {
        //수포자 3명은 문제를 전부 찍으려고한다.
        //1번문제부터 마지막 문제까지의 정담이 순서대로 들은 배열 answers
        //가장 많은 문제를 맞힌 사람이 누구인가?
        //가장 높은 점수를 받은 사람이 여럿일 경우, 오름차순

        int[] answers =new int[]{1,2,3,4,5};



        //배열에서 중복된 패턴 찾아야함
        int[] supo1 = {1,2,3,4,5};//5
        int[] supo2 = {2,1,2,3,2,4,2,5};//8
        int[] supo3 = {3,3,1,1,2,2,4,4,5,5};//10

        List<Integer> correctList = new ArrayList<>();//맞춘리스트
        for(int i=1; i <= 3; i++){
            correctList.add(0);//맞춘사람 리스트에 1,2,3 에 0씩 부여
        }

        for(int i=0; i<answers.length; i++){
            if(answers[i] == supo1[i%5]){
                correctList.set(0, correctList.get(0)+1);
            }
            if(answers[i] == supo2[i%8]){
                correctList.set(1, correctList.get(1)+1);
            }
            if(answers[i] == supo3[i%10]){
                correctList.set(2, correctList.get(2)+1);
            }
        }

        int max = Collections.max(correctList);
        System.out.println(max);
        List<Integer> returnList  = new ArrayList<>();
        for(int i=1; i<= correctList.size(); i++){
            if(max == correctList.get(i-1)){
                returnList.add(i);
            }
        }
        int[] answer = new int[returnList.size()];
        for(int i=0; i< returnList.size(); i++){
            answer[i] = returnList.get(i);
        }
        System.out.println(Arrays.toString(answer));







    }
}
