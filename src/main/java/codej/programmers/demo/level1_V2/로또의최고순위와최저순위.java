package codej.programmers.demo.level1_V2;

import java.util.Arrays;

public class 로또의최고순위와최저순위 {
    public int[] solution(int[] lottos, int[]win_nums){
        //당첨 가능한 최고 순위,최저 순위
        //4개일치 3등, 2개번호 일치 5d
        int[] answer = new int[2];
        int match =0;
        int zero = 0;
        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        for(int i : lottos){
            if(Arrays.binarySearch(win_nums,i) >= 0){
                match++;
            }
            if( i ==0){
                zero++;
            }
            //최고 순위
            answer[0]= getRank(match+zero);
            //최저 순위
            answer[1]= getRank(match);

        }

        System.out.println(Arrays.toString(lottos));
        System.out.println(Arrays.toString(win_nums));


        return answer;
    }
    static int getRank(int n){
        switch (n){
            case 6 :
                return 1;
            case 5 :
                return 2;
            case 4 :
                return 3;
            case 3 :
                return 4;
            case 2 :
                return 5;
            default:
                return 6;
        }
    }
    public static void main(String[] args) {
        int[] lottos ={44, 1, 0, 0, 31, 25};
        int[] win_num={31, 10, 45, 1, 6, 19};
        로또의최고순위와최저순위 sol = new 로또의최고순위와최저순위();
        System.out.println(        sol.solution(lottos,win_num)
        );
    }
}
