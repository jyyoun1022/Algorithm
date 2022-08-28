package codej.programmers.demo.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문자열_내림차순으로_배치하기 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        String[] split = s.split("");
        System.out.println(Arrays.toString(split));
        List<String> list = new ArrayList<>();
        for (String s1 : split) {
            list.add(s1);
        }
        list.sort(Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i));
        }
        System.out.println(sb.toString());

    }
}
