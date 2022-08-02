package codej.programmers.demo.level1;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = sc.nextInt();

        String answer = "";
        for(char ch : s.toCharArray()) {
            if(ch==' ') {
                answer += ch;
            }else if(ch>='a'&& ch<='z'){
                answer += (char)('a' + (ch+n-'a')%26);
            }else {
                answer += (char)('A' + (ch+n-'A')%26);
            }
        }
        System.out.println(answer);
        }
    }


