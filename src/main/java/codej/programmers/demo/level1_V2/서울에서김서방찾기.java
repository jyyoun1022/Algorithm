package codej.programmers.demo.level1_V2;

public class 서울에서김서방찾기 {
    public String solution(String[] seoul){
        String answer ="";
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer ="김서방은 "+i +"에 있다";
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] seoul = {"Jane","Kim"};
        서울에서김서방찾기 sol = new 서울에서김서방찾기();
        System.out.println(        sol.solution(seoul)
        );
    }
}
