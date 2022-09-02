package codej.programmers.demo.string;

import java.util.Arrays;

public class ArrSort {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = new int[]{2, 1, 2, 6, 2, 4, 3, 3};

        int user = stages.length;  //사람 수
        int[] answer = new int[N];
        double[] failure = new double[N + 1];

        /*각 스테이지별 실패율 구하기*/
        for(int i = 1; i <= N; i++) {
            int challenger = 0;

            for(int u : stages) {
                if(u == i) {
                    challenger++;
                }
            }
            failure[i] = (double)challenger/user;
            if(Double.isNaN(failure[i])) {
                failure[i] = 0;
            }
            user -= challenger;
        }

        /*answer 작성*/
        for(int i = 0; i < N; i++) {
            double max = -1.0;
            for(int j = 1; j <= N; j++) {
                if(failure[j] > max) {
                    max = failure[j];
                    answer[i] = j;
                }
            }
            failure[answer[i]] = -1.0;
            System.out.println(Arrays.toString(failure));
        }
        System.out.println(Arrays.toString(answer));
    }
}
