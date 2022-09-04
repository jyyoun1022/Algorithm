package codej.programmers.demo.level1;

public class 키패드누르기 {
    public String solution(int[] numbers,String hand){

        StringBuilder sb = new StringBuilder();
        String answer ="";
        int leftHand = 10;//* 을 치환
        int rightHand = 12;//# 을 치환

        for(int number : numbers){
            if(number == 1 || number ==4 || number == 7){//left
                sb.append("L");
                leftHand=number;
            } else if (number == 3 || number == 6 || number ==9) {//right
                sb.append("R");
                rightHand = number;
            }else {//center
                if(number == 0){
                    number = 11;
                }
                int leftdist = Math.abs(number - leftHand) / 3 + Math.abs(number - leftHand) % 3;
                int rightdist = Math.abs(number - rightHand) / 3 + Math.abs(number - rightHand) % 3;

                if(leftdist < rightdist){
                    sb.append("L");
                    leftHand = number;
                }else if(leftdist > rightdist){
                    sb.append("R");
                    rightHand = number;
                }else {
                    if(hand.equals("left")){
                        sb.append("L");
                        leftHand =number;
                    }else {
                        sb.append("R");
                        rightHand = number;

                    }
                }

            }
        }
        answer = sb.toString();

        return answer;
    }
    public static void main(String[] args) {
        int[] numbers ={1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand ="right";
        키패드누르기 sol = new 키패드누르기();
        System.out.println(sol.solution(numbers,hand));
    }
}
