package codej.programmers.demo.level1;

public class 음양_더하기 {
    public int solution(int[] absolutes,boolean[]signs){

        int answer =0;

        String[] char_arr = new String[signs.length];

        for(int i=0; i< signs.length; i++){
            if(signs[i] == true){
                char_arr[i]= "+";
            }else{
                char_arr[i] ="-";
            }
        }

        for(int i=0; i< absolutes.length; i++){
            System.out.println(char_arr[i]);
            System.out.println(absolutes[i]);
            answer += Integer.parseInt(char_arr[i]+absolutes[i]);

            System.out.println(answer);
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        음양_더하기 sol = new 음양_더하기();
        sol.solution(absolutes,signs);

    }

}
