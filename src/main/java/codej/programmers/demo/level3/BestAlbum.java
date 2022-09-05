package codej.programmers.demo.level3;

import java.util.*;

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays){
        //스트리밍 사이트에서 장르별로 가장 많이 재생된 노래 2개 픽
        //두개를 모아 베스트 앨범을 출시하려고함.
        //노래는 고유번호로 구분
        //노래를 수록하는 기준
        //3. 장르 내에서 재생횟수가 같은 노래중에서는 고유 번호가 낮은 노래를 먼저 수록

        //노래의 장르는 나타내느 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays
        //베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i< genres.length; i++){
            map.put(genres[i], map.getOrDefault(genres[i],0)+plays[i]);
        }

        //1.장르 2개 골라
        ArrayList<Object> orderList = new ArrayList<>();
        for (String key : map.keySet()) {
            orderList.add(key);
        }
        //1. 속한 노래가 많이 재생된 장르를 먼저 수록
        Arrays.sort(orderList.toArray());
        //2. 장르 내에서 많이 재생된 노래를 먼저 수록


        System.out.println(Arrays.toString(orderList.toArray()));
        int[] answer ={};
        System.out.println(Arrays.toString(answer));
        return answer;
    }
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays ={500, 600, 150, 800, 2500};
        BestAlbum sol = new BestAlbum();
        sol.solution(genres,plays);

    }

}
