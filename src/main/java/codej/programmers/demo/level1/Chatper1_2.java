package codej.programmers.demo.level1;

import java.util.Arrays;
import java.util.Scanner;

public class Chatper1_2 {
    public static void main(String[] args) {


        int[][]array1 = {{10,20},{30,40}};
        int[][]array2 = {{50,60},{70,80},{45,60}};

        int [][] result = new int [2][3];

        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array1[i].length; j++){

                result[i][j] = array1[i][j]+array2[i][j];

                System.out.println(result[i][j]);
            }
        }

    }
}
