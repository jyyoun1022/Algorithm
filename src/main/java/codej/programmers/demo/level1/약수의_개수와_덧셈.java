package codej.programmers.demo.level1;

public class 약수의_개수와_덧셈 {
    public static void main(String[] args) {
        int left = 13;
        int right = 17;

        //left 부터 rigth 까지의 모든 수들 중
        //약수의 개수가 짝수인 수는 더하고
        //약수의 개수가 홀수인 수는 뺀 수를 return

        int count =0;
        int answer =0;
        for(int i=left; i <= right; i++){
            for(int j=1; j<=i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count % 2==0){
                answer += i;

            }else{
                answer -= i;
            }
            count =0;
        }
        System.out.println(answer);
    }
}
