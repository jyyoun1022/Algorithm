package codej.programmers.demo.level1;

public class 신규_아이디_추천 {

    public String solution(String new_id){
        //새로 가입하는 유저들이 카카오 아이디 규칙에 맞지 않는 아이디를 입력했을 때,
        //입력된 아이디와 유사하면서 규칙에 맞는 아이디를 추천해주는 프로그램을 개발
        //아이디의 길이는 3자 이상 15자 이하
        //아이디는 알파벳,숫자,- , _ , . 만 사용가능
        //단, 마침표는 처음과 끝에 사용할 수 있으며 또한 연속으로 사용할 수 없습니다.
        String answer ="";

//        1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        String step1 = new_id.toLowerCase();
//        2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        char[] step1_arr = step1.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : step1_arr){
            if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '_' || c =='-' || c == '.'){
                sb.append(c);
            }
        }
//        3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        String step3 = sb.toString().replace("..", ".");
        while(step3.contains("..")){
            step3 = step3.replace("..",".");
        }
//        4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        String step4 = step3;
        if(step4.length()>0){
            if (step4.charAt(0) == '.'){
                step4 = step4.substring(1,step4.length());
            }
        }
        if(step4.length() >0){
            if(step4.charAt(step4.length()-1) == '.'){
                step4 = step4.substring(0, step4.length() - 1);
            }
        }
//        5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        String step5 = step4;
        if(step5.equals("")){
            step5 = "a";
        }
//        6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        String step6 = step5;
        if(step6.length() >= 16){
            step6 = step6.substring(0, 15);
//                만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
            if(step6.charAt(step6.length() -1) == '.'){
                step6 = step6.substring(0, step6.length() - 1);
            }
        }
//        7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        StringBuilder step7 = new StringBuilder(step6);
        if(step7.length() <= 2){
            char last = step7.charAt(step7.length() - 1);
            while(step7.length() < 3){
                step7.append(last);
            }
        }
        answer = step7.toString();

        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        String new_id = "abcdefghijklmn.p";
        신규_아이디_추천 sol = new 신규_아이디_추천();
        sol.solution(new_id);
    }
}
