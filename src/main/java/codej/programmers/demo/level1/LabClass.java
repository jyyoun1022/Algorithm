package codej.programmers.demo.level1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LabClass {
    public static void main(String[] args) {

//        정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
//                단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고,
//        [10]면 [-1]을 리턴 합니다.

        int[] arr;
        System.out.println("입력받을 배열의 개수를 적어주세요");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        arr = new int[count];

        System.out.println("입력할 값을 넣어주세요.");
        for(int i=0; i<count; i++){
            arr[i] = sc.nextInt();
        }


        int min = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();

        for(int i=0; i< arr.length; i++){
            list.add(arr[i]);
            if(min > arr[i]){
                min = arr[i];
            }
        }
        list.remove(list.indexOf(min));
        int[] newArr = new int[list.size()];

        for(int i=0; i< newArr.length; i++){
            newArr[i] = list.get(i);
        }

        System.out.println(Arrays.toString(newArr));

    }
}
