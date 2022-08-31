package codej.programmers.demo.level1;

import java.util.Calendar;

public class LeapYear {
    public static void main(String[] args) {

        //2016년 1월 1일은  금요일
        //2016년 a월 b일은 무슨 요일?
        //요일의 이름은 SUN,MON,TUE,WED,THU,FRI,SAT
        //a=5,b=24 라면 5월24일은 화요일 이므로 문자열 "TUE"를 반환
        //2016년은 윤년
        //윤년은 주로 2월을 29일로 둔 해를 말한다.
        int a = 5;
        int b = 24;

        Calendar c = Calendar.getInstance();
        c.set(2016,a-1,b);
        String[] answer ={"SUN", "MON","TUE","WED", "THU", "FRI", "SAT"};

        int weekday = c.get(Calendar.DAY_OF_WEEK);

        System.out.println(answer[weekday-1]);
    }
}
