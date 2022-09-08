package codej.programmers.demo.level1_V2;

public class 신규아이디추천 {
    public String solution(String new_id){
        String answer ="";
        //아이디의 길이는 3자이상 15자 이하
        //아이디는 알파벳,소문자,숫자,-,_,. 만 가능
        //단 마침표는 처음과 끝에는 사용 불가

//        1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        String step1 = new_id.toLowerCase();
//        2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        StringBuilder step2 = new StringBuilder();
        char[] arr = step1.toCharArray();
        for (char c : arr) {
            if(c>= 'a' && c<= 'z' || c >= '0' && c <= '9' || c== '-'|| c== '_'||c=='.'){
                step2.append(c);
            }
        }

//        3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        String step3 = step2.toString().replace("..", ".");
        while(step3.contains("..")){
            step3 = step3.replace("..", ".");
        }
//        4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        String step4 = step3;
        if(step4.length() > 0){
        if(step4.charAt(0) == '.'){
            step4 = step4.substring(1);
        }}
        if(step4.length() > 0){

            if(step4.charAt(step4.length()-1) =='.'){
                step4 = step4.substring(0,step4.length()-1);
            }
        }
//        5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        String step5 = step4;
        if(step5.equals("")){
            step5 += 'a';
        }
//        6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        String step6 = step5;
        if(step6.length() >= 16){
            step6 = step6.substring(0, 15);
        }
//                만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if(step6.charAt(step6.length()-1) =='.'){
            step6 = step6.substring(0, step6.length() - 1);
        }
//        7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        String step7 = step6;
        if(step7.length() <= 2){
            while(step7.length() < 3){
                step7 = step7 +  step7.charAt(step7.length()-1);
            }
        }
        answer = step7;
        return answer;
    }
    public static void main(String[] args) {
        String new_id = 	"z-+.^.";
        신규아이디추천 sol = new 신규아이디추천();
        System.out.println(        sol.solution(new_id)
        );
    }
}
