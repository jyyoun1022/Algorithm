package codej.programmers.demo.level1;

public class 나머지가_1이되는수_찾기 {
    public static void main(String[] args) {
        long n = 10;
        int i=1;
        int answer =0;

//        for (int i = 2; i < n; i++) {
//            if (n % i == 1) {
//                answer =i;
//                break;
//            }
//
//        }
        while(n >= i ){
            if(n % i == 1){
                answer=i;
                break;
            }
            i++;

        }
        System.out.println(answer);

    }
}
