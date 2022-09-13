package codej.programmers.demo.level1_V2;

public class 부족한금액계산하기 {
    public long solution(int price, int money, int count){
        //놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는 지 return
        long answer = 0;
        long sum = 0;
        for(int i=1; i<=count; i++){
            sum += price*i;
        }
        if(money > sum){
            return 0;
        }
        answer = Math.abs(sum -money);
        return answer;
    }
    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;
        부족한금액계산하기 sol = new 부족한금액계산하기();
        System.out.println(        sol.solution(price,money,count)
        );
    }
}
