package codej.programmers.demo.level1;

public class 없는_숫자_더하기 {
    public int solution(int[] numbers){
        int answer =45;
        int temp =0;
        for(int i=0; i< numbers.length; i++){
            temp += numbers[i];
        }
        answer -= temp;
        return answer;
    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        없는_숫자_더하기 sol = new 없는_숫자_더하기();
        System.out.println(sol.solution(numbers));


    }
}
