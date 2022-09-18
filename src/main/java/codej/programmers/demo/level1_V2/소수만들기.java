package codej.programmers.demo.level1_V2;

public class 소수만들기 {
    public int solution(int[] nums){
        int answer =0;

        // 주어진 숫자 3개의 수의 합
        int sum =0;

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                for(int k = j+1; k< nums.length; k++){
                    sum = nums[i] + nums[j] + nums[k];
                    answer += isPrime(sum) ? 1 : 0;
                }
            }
        }
        return answer;
    }
    public boolean isPrime(int num){
        for(int i=2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,7,6,4};
        소수만들기 sol = new 소수만들기();
        System.out.println(        sol.solution(nums)
        );
    }
}
