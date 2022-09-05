package codej.programmers.demo.level1_V2;

public class 삼진법뒤집기 {
    public int solution(int n){
        int answer =0;
        String base ="";
        while(n != 0){
            base = (n %3) + base;
            n /= 3;
        }
        StringBuilder sb = new StringBuilder();
        base= sb.append(base).reverse().toString();
         answer = Integer.parseInt(base, 3);
        return answer;
    }

    public static void main(String[] args) {
        int n = 45;
        삼진법뒤집기 sol = new 삼진법뒤집기();
        System.out.println(        sol.solution(n)
        );
    }
}
