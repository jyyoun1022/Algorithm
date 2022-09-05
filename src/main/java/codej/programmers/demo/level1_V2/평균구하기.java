package codej.programmers.demo.level1_V2;

public class 평균구하기 {
    public double solution(int[] arr){
        double answer =0;
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        answer = (double)sum / arr.length;
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        평균구하기 sol = new 평균구하기();
        System.out.println(        sol.solution(arr));
    }
}
