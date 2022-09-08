package codej.programmers.demo.level1_V2;

public class 키패드누르기 {
    public String solution(int[] numbers, String hand){
        String answer ="";
        int right = 12;
        int left = 10;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i< numbers.length; i++){
            if(numbers[i] == 1 || numbers[i] == 4|| numbers[i] ==7){
                sb.append("L");
                left = numbers[i];
            }else if(numbers[i] == 3 || numbers[i]==6 || numbers[i] ==9){
                sb.append("R");
                right = numbers[i];
            }else{
                if(numbers[i] == 0){
                    numbers[i] =11;
                }

                int leftdist = Math.abs(numbers[i]-left)/3 +Math.abs(numbers[i]-left)%3;

            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] numbers ={1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        키패드누르기 sol = new 키패드누르기();
        System.out.println(        sol.solution(numbers,hand)
        );
    }
}
