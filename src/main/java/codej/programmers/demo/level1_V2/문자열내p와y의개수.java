package codej.programmers.demo.level1_V2;

public class 문자열내p와y의개수 {
    boolean solution(String s){
        boolean answer =true;
        s = s.toUpperCase();
        int pCnt =0;
        int yCnt =0;

        char[] arr = s.toCharArray();
        for (char c : arr) {
            if(c == 'P'){
                pCnt++;
            }else if (c =='Y'){
                yCnt++;
            }
        }
        answer = pCnt == yCnt;


        return answer;
    }
    public static void main(String[] args) {
        String s ="pPoooyY";
        문자열내p와y의개수 sol = new 문자열내p와y의개수();
        System.out.println(        sol.solution(s)
        );
    }
}
