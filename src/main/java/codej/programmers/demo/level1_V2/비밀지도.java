package codej.programmers.demo.level1_V2;

import java.util.Arrays;

public class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2){
        String[] answer =new String[n];
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0; i<n; i++){
            String str1 = Integer.toBinaryString(arr1[i]);
            String str2 = Integer.toBinaryString(arr2[i]);
            String temp = "";
            //정수를 2진수로 변환했을 때, 앞에 0 을 붙여야 하는경우
            //따라서 (n - str.length ) 만큼 0을 추가
            if(str1.length() < n){
                for(int j=0; j<n-str1.length(); j++){
                    sb1.append("0");
                }
            }
            sb1=sb1.append(str1);

            if(str2.length() < n){
                for(int j=0; j<n-str2.length(); j++){
                    sb2.append("0");
                }
            }
            sb2 = sb2.append(str2);


            for(int j=0; j<sb1.length(); j++){
                if(sb1.charAt(j) == '1' || sb2.charAt(j) == '1'){
                    temp += "#";
                }else{
                    temp += " ";
                }
            }

            answer[i] = temp;
            sb1.setLength(0);
            sb2.setLength(0);
        }

        return answer;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};
        비밀지도 sol = new 비밀지도();
        System.out.println(        sol.solution(n,arr1,arr2)
        );
    }
}
