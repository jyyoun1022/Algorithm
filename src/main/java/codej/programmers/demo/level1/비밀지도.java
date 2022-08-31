package codej.programmers.demo.level1;

import codej.programmers.demo.string.Chara;

import java.util.Arrays;

public class 비밀지도 {

    public static void main(String[] args) {
        int n =5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30, 1, 21, 17, 28};

        String[] answer =new String[n];

        StringBuilder encoding = new StringBuilder();//2진법으로 만들 sb
        StringBuilder decoding = new StringBuilder();//"#"," " 으로 만들 sb


        //정수 배열의 각 원소 x를 이진수로 변환했을 때의 길이는 n 이하이다. 즉, 0 ≦ x ≦ 2n - 1을 만족한다.
        //라고 명시했으므로 0부터 n까지 루프
        for(int i=0; i<n; i++){
            int temp = arr1[i] | arr2[i];//비트연산자(1 | 0 = 1)
            String binary = Integer.toBinaryString(temp);//2진법으로 바꿔주는메서드(String 타입)
            encoding.append("0".repeat(n-binary.length())+binary);//2진법으로 만들 sb에 추가
//            if(binary.length() < n){//만약 2진법으로 바꾸었을 때 1011이면 앞에 0을 넣어줘야하므로 0번째에 0을 추가
//                while(binary.length() == n){
//                    encoding.insert(n-binary.length()-1,"0");
//                }
//            }



            for(int j=0; j<encoding.length(); j++){//10111일 때 0은 공백으로,1은 #으로 입력하기 위한 루프
                Character getChar = encoding.charAt(j);//charAt(i) = char 형이지만 equals()메서드를 사용하기위해 Character로 변환
                if(getChar.equals('1')){
                    decoding.append("#");
                }else{
                    decoding.append(" ");
                }
            }
            answer[i] = decoding.toString();
            encoding.setLength(0);//
            decoding.setLength(0);//StringBuilder를 초기화주는 메서드
        }
        System.out.println(Arrays.toString(answer));

    }
}
