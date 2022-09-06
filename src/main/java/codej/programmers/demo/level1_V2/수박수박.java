package codej.programmers.demo.level1_V2;

public class 수박수박 {
    public String solution(int n){
        String answer ="";
        for(int i=1; i<=n; i++){
            if(i%2==0){
                answer += "박";
            }else{
                answer += "수";
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int n=3;
        수박수박 sol = new 수박수박();
        System.out.println(        sol.solution(n)
        );
    }
}
