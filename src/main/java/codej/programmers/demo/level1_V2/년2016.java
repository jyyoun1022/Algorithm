package codej.programmers.demo.level1_V2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class 년2016 {
    public String solution(int a , int b){
        String answer ="";

        Calendar cal = Calendar.getInstance();
        cal.set(2016,a-1,b);
        Date date = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("E", Locale.ENGLISH);
        answer = sdf.format(date).toUpperCase();
        return answer;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        년2016 sol = new 년2016();
        System.out.println(        sol.solution(a,b)
        );
    }
}
