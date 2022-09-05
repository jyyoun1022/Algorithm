package codej.programmers.demo.level1_V2;

public class 짝수와홀수 {
    public String solution(int num){
        String answer ="";
        answer = num % 2 ==0 ? "Even" : "Odd";
        return answer;
    }
    public static void main(String[] args) {
        int num =3;
        짝수와홀수 sol = new 짝수와홀수();
        System.out.println(        sol.solution(num)
        );
    }
}
