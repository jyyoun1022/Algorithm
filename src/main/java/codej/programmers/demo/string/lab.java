package codej.programmers.demo.string;

import java.util.Arrays;

public class lab {
    public static void main(String[] args) {
        String str = "010-4623-2891";
        int strLength = str.length();
        int i = str.lastIndexOf("-");

        System.out.println("str = " + str);

        System.out.println("strLength = " + strLength);
        System.out.println(i);

    }
}
