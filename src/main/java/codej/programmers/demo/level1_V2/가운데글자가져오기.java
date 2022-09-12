package codej.programmers.demo.level1_V2;

public class 가운데글자가져오기 {
    public String solution(String s){
        String answer ="";
        if(s.length() %2 ==0){//글자의 개수가 짝수일때
            answer = s.substring((s.length()/2)-1,(s.length()/2)+1);
        }else{
           answer = s.substring(s.length()/2,(s.length()/2)+1);
        }
        return  answer;
    }
    public static void main(String[] args) {
        String s ="qwer";
        가운데글자가져오기 sol = new 가운데글자가져오기();
        System.out.println(        sol.solution(s)
        );
    }
}
