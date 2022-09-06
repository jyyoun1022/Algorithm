package codej.programmers.demo.level1_V2;

public class 문자열다루기기본 {
    public boolean solutioin(String s){
        boolean answer =true;

        if(s.length() != 4 && s.length() != 6){
            answer =false;
        }
        if(answer){
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);

                if((c >= 'a' && c <= 'z')  || (c >= 'A' && c <= 'Z')){
                    answer = false;
                    break;
                }

            }
        }

        return  answer;
    }

    public static void main(String[] args) {
        String s = "a234";
        문자열다루기기본 sol = new 문자열다루기기본();
        System.out.println(        sol.solutioin(s)
        );
    }
}
