package codej.programmers.demo.level1_V2;

public class 콜라츠추측 {
    public long solution(long num){
        long answer =0;

        while(answer <= 500){
            if(num ==1){
                return answer;
            }else{
                if(num % 2 ==0){
                    num /=2;
                }else {
                    num = num*3 +1;
                }
                answer++;
            }
        }
        answer =-1;
        return answer;
    }
    public static void main(String[] args) {
        int num = 6;
        콜라츠추측 sol = new 콜라츠추측();
        System.out.println(        sol.solution(num)
        );
    }
}
