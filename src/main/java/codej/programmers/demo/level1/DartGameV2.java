package codej.programmers.demo.level1;

import java.util.Arrays;

public class DartGameV2 {
    public static void main(String[] args) {
        String dartResult = "1D2S#10S";
        int answer = 0;
        int[] arr = new int[3];
        int idx = 0;

        char[] charArr = dartResult.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            int num = Character.getNumericValue(charArr[i]);
            if (num >= 0 && num <= 9) {
                if (charArr[i] == '1' && charArr[i + 1] == '0') {
                    num = 10;
                    i++;
                }
                arr[idx] = num;
                System.out.println(Arrays.toString(arr));
               idx++;
            } else {
                switch (charArr[i]) {
                    case 'S':
                        arr[idx - 1] = (int) (Math.pow(arr[idx - 1], 1));
                        break;
                    case 'D':
                        arr[idx - 1] = (int) (Math.pow(arr[idx - 1], 2));
                        break;
                    case 'T':
                        arr[idx-1] = (int) (Math.pow(arr[idx - 1], 3));
                        break;
                    case '*':
                        if (idx - 2 >= 0) {
                            arr[idx - 2] *= 2;
                        }
                        arr[idx -1] *= 2;
                        break;
                    case '#':
                        arr[idx - 1] *= -1;
                        break;
                }

            }




        }
        for (int i1 : arr) {
            answer += i1;
        }
        System.out.println(answer);
    }
}
