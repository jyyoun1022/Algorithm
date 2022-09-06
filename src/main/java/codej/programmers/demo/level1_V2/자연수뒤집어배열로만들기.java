package codej.programmers.demo.level1_V2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 자연수뒤집어배열로만들기 {
    public int[] solution(long n){

        List<Integer> list = new ArrayList<>();

        while(n != 0) {
            list.add((int)(n % 10));
            n /= 10;
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        int n =12345;
        자연수뒤집어배열로만들기 sol = new 자연수뒤집어배열로만들기();
        System.out.println(        sol.solution(n)
        );
    }
}
