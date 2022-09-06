package codej.programmers.demo.level1_V2;

public class 자릿수더하기 {
    public int solution(int n){
        int answer =0;
        String str = String.valueOf(n);
        String[] arr = str.split("");
        for (String s : arr) {
            answer += Integer.parseInt(s);
        }

        return answer;
    }
    public static void main(String[] args) {
        int n = 123;
        자릿수더하기 sol = new 자릿수더하기();
        System.out.println(        sol.solution(n)
        );
    }
}
