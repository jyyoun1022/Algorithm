package codej.programmers.demo.level1;

import java.util.Scanner;

public class String_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] chars = str.split("").toString().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
        }
        int answer = Integer.parseInt(sb.toString());
        System.out.println(answer);

    }
}
