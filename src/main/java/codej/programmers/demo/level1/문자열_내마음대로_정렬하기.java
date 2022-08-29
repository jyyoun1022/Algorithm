package codej.programmers.demo.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문자열_내마음대로_정렬하기 {
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        List<String> list = new ArrayList<>();
        for(int i=0; i< strings.length; i++){
            list.add(strings[i].charAt(n)+strings[i]);
        }
        Collections.sort(list);

        String[] answer =new String[list.size()];

        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i).substring(1);
        }

        System.out.println(Arrays.toString(answer));

    }
}
