package codej.programmers.demo.level1_V2;

public class 핸드폰번호가리기 {
    public String solution(String phone_number){
        StringBuilder sb = new StringBuilder();
        String[] arr = phone_number.split("");

        for(int i=0; i<arr.length; i++){
            if(i <= arr.length-5){
                sb.append("*");
            }else {
                sb.append(arr[i]);
            }
        }

        System.out.println(sb);
        return String.valueOf(sb);

    }
    public static void main(String[] args) {

        String phone_number= "01033334444";
        핸드폰번호가리기 sol = new 핸드폰번호가리기();
        sol.solution(phone_number);
    }
}
