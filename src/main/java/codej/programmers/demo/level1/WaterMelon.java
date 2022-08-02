package codej.programmers.demo.level1;

import java.util.Scanner;

public class WaterMelon {

    public static String solution(int n){
        String[] a = {"수","박"};
        String answer ="";

        StringBuilder sb = new StringBuilder();


        for(int i=1; i<=n; i++){
            if(i % 2 !=0){
                sb.append(a[0]);
            }else {
                sb.append(a[1]);
            }
        }
        answer=sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(WaterMelon.solution(n));
    }
}
