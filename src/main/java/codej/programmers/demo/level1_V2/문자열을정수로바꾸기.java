package codej.programmers.demo.level1_V2;

public class 문자열을정수로바꾸기 {
    public int solution(String s){
        int answer =0;
        if(s.contains("-")){
            answer = Integer.parseInt(s);
        }else{
            answer = Integer.parseInt(s);
        }
        //이렇게 할 필요없이 Integer.parseInt()만 해줘도 음수,양수를 판단해준다.

        return answer;
    }
    public static void main(String[] args) {
        String s ="-1234";//부호구분해야함
        문자열을정수로바꾸기 sol = new 문자열을정수로바꾸기();
        System.out.println(        sol.solution(s)
        );


    }
}
