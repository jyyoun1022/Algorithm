package codej.programmers.demo.level1_V2;

public class 숫자문자열과영단어 {
    public int solution(String s){
        int answer =0;

        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0; i<= 9; i++){
            s = s.replace(arr[i], String.valueOf(i));
        }
        answer = Integer.parseInt(s);


        return answer;
    }
    public static void main(String[] args) {
        String s = "one4seveneight";
        숫자문자열과영단어 sol = new 숫자문자열과영단어();
        System.out.println(        sol.solution(s)
        );
    }
}
