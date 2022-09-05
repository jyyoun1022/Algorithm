package codej.programmers.demo.level1_V2;

public class 하샤드수 {
    public boolean solution(int x){
        boolean answer =true;
        int temp =x;
        int sum = 0;

        while(x >0){
            sum += x%10;
            x /=10;
        }
        answer = temp%sum == 0 ? true : false;
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        int arr = 11;
        하샤드수 sol = new 하샤드수();
        sol.solution(arr);
    }
}
