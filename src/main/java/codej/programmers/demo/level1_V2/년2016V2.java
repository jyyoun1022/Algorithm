package codej.programmers.demo.level1_V2;

public class 년2016V2 {
    public String solution(int a, int b){
        String answer ="";

        // 1월 1일이 금요일 이므로,금요일부터 시작하여 요일 이름을 저장.
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};

        // 모든 날짜를 더해 %7 로 나누어준다.
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int date =0;
        for(int i=0; i<a-1; i++){
            date += month[i];
        }
        date += b-1;
        answer = day[date % 7];
        return answer;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        년2016V2 sol = new 년2016V2();
        System.out.println(        sol.solution(a,b)
        );
    }
}
