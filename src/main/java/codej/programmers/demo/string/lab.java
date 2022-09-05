package codej.programmers.demo.string;

import java.util.*;

public class lab {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<9; i++){
            stack.push(i);
        }
        for (Integer integer : stack) {
            System.out.println(integer);
        }

    }
}