package codej.programmers.demo.level1;

import java.util.Arrays;

public class Solution_Sort {


    public String solution(String[] participant, String[] completion){
        //1. 두 배열을 정렬한다.
        Arrays.sort(participant);
        Arrays.sort(completion);

        //2. 두 배열이 다를 때까지 찾는다.
        int i=0;
        for( i=0; i< completion.length; i++){
            if(! participant[i].equals(completion[i])){
                break;
            }
            return participant[i];
        }
        return participant[i];

    }

    public static void main(String[] args) {
        String[] part ={"leo","kiki","eden"};
        String[] comp = {"eden","kiki"};
        Solution_Sort sol = new Solution_Sort();
        System.out.println(sol.solution(part,comp));
    }
}
