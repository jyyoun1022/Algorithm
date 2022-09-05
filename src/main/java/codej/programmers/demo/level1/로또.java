package codej.programmers.demo.level1;

import java.util.Arrays;

public class 로또 {

    public int[] solution(int[] lottos, int[] win_nums){
        int[] answer =new int[2];
        //낙서로 인해 알아볼수 없는 번호를 0 으로 표기
        int matchCnt =0;
        int zeroCnt = 0;

        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        //최저순위
        for(int i : lottos){
            if(Arrays.binarySearch(win_nums,i) >= 0){
                matchCnt++;
            }
            if(i == 0 ){
                zeroCnt++;
            }
            answer[1] = Math.min(7-matchCnt,6);
            //최고 순위
            answer[0] = Math.min(7-(matchCnt +zeroCnt),6);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
    public static void main(String[] args) {
        int[] lottos ={44, 1, 0, 0, 31, 25};
        int[] win_nums ={31, 10, 45, 1, 6, 19};
        로또 sol = new 로또();
        sol.solution(lottos,win_nums);
    }
}
