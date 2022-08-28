package codej.programmers.demo.string;

public class 문자열_P_Y_개수 {
    public static void main(String[] args) {
        String s = "pPoooyY";
        int count1 =0;
        int count2 =0;

        String str = s.toLowerCase();

        String[] split = str.split("");

        for (String s1 : split) {
            if(s1.equals("p")){
                count1++;
            } else if (s1.equals("y")) {
                count2++;
            }
        }
        System.out.println(count1 == count2 ? true : false);
    }
}
