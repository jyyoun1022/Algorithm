package codej.programmers.demo.string;

import java.util.Arrays;

public class lab {
    public static void main(String[] args) {
        String[] str =new String[]{"str","builder","google"};
        System.out.println(Arrays.stream(str).toArray().toString());
        System.out.println(str.length);

    }
}
