package codej.programmers.demo.level1_V2;

import java.util.ArrayList;
import java.util.Arrays;

public class 다트게임 {
    public int solution(String dartResult){
        int answer =0;
        int score =0;
        char[] arr = dartResult.toCharArray();
        int[] scoreList = new int[3];
        ArrayList<Integer> finalScore = new ArrayList<>();
       //1.dartResult를 count 별로 끊어야함
        int count =0;
        for(int i=0; i<arr.length; i++){
            int dartInt =Character.getNumericValue(arr[i]);
            if(arr[i] >= '1' && arr[i] <= '9'){
                if(arr[i] =='1' && arr[i+1] =='0'){
                    dartInt =10;
                }
                scoreList[count]=dartInt;
            }else if(arr[i] == 'S' || arr[i] =='D' || arr[i] =='T'){
                if( arr[i] == 'S'){
                    scoreList[count] = (int)Math.pow(scoreList[count],1);
                       count++;
                } else if (arr[i] == 'D') {
                    scoreList[count] = (int)Math.pow(scoreList[count],2);
                    count++;
                }else{
                    scoreList[count] = (int)Math.pow(scoreList[count],3);
                    count++;
                }
            }else {
                if(arr[i] == '*'){
                    if(count==1) {
                        scoreList[count-1] *= 2;
                    }else {
                            scoreList[count-1] *= 2;
                            scoreList[count-2] *= 2;

                    }
                }else if(arr[i] == '#'){
                    scoreList[count-1] *= -1;
                }
            }
        }
        System.out.println(Arrays.toString(scoreList));
        for (int i : scoreList) {
            answer += i;
        }
        return answer;
    }
    public static void main(String[] args) {
        String dartResult ="1D2S#10S";
        다트게임 sol = new 다트게임();
        System.out.println(        sol.solution(dartResult)
        );
    }
}
