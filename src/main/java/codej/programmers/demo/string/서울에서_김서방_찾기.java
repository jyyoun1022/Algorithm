package codej.programmers.demo.string;

import java.util.ArrayList;
import java.util.List;

public class 서울에서_김서방_찾기 {
    public static void main(String[] args) {
        String answer = "";
        String[] seoul = new String[]{"Jane","Kim"};
        List<String> list = new ArrayList<>();
        for (int i=0; i<seoul.length; i++){
            list.add(seoul[i]);
        }
        int count = list.indexOf("Kim");
        System.out.println(count);
        for (String s : list) {
            if(s.equals("Kim")){
                System.out.println("김서방은 "+count+"에 있다.");
            }
        }
    }
}
