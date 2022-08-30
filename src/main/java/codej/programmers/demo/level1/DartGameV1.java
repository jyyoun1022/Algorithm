package codej.programmers.demo.level1;

public class DartGameV1 {
    public static void main(String[] args) {
        //다트를 3차례 던짐,그점수의 합계로 실력,점수로직
        //0-10점 까지, S,D,T(1,2,3 제곱) 존재
        //스타상(*) 해당점수,바로전에 얻은 점수를 곱하기
        //아차상($) 해당 점수는 마이너스
        // 스타상(*)은 첫번째 기회에서 나올때는 점수만 2배
        //스타상(*)은 중첩가능,중첩된 스타상점수는 4배
        //스타상과 아차상은 중첩될경우 아차상은 -2배
        String dartResult = "1D2S#10S";
        int answer = 0;
        int answer_arr[] = new int[3];
        int index=0;
        int intCnt =0;

        for(int i=0; i<dartResult.length(); i++){
            char dartChar = dartResult.charAt(i);
            int dartInt = Character.getNumericValue(dartChar);

            if(dartInt >= 0 && dartInt <=10){//score
                if(dartInt == 1){
                    if(Character.getNumericValue(dartResult.charAt(i+1)) == 0){
                        dartInt= 10;
                        i++;
                    }
                }
                answer_arr[index] = dartInt;
                intCnt++;
            }else{//bonus & option
                switch (dartChar){
                    case 'S'://x1
                        answer_arr[index] =(int)(Math.pow(answer_arr[index],1));
                        index++;
                        break;
                    case 'D' ://x2
                        answer_arr[index] = (int)(Math.pow(answer_arr[index],2));
                        index++;
                        break;
                    case 'T' ://x2
                        answer_arr[index] = (int)(Math.pow(answer_arr[index],3));
                        index++;
                        break;
                    case '*' :
                        index = index -2 < 0? 0:index-2;
                        while(index < intCnt){
                            answer_arr[index] = answer_arr[index]*2;
                            index++;
                        }
                        break;
                    case '#' :
                        answer_arr[index-1] = answer_arr[index-1]*(-1);
                        break;

                }
            }
        }
        for (int i : answer_arr) {
            answer += i;
        }
        System.out.println(answer);
    }
}
