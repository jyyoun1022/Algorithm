package codej.programmers.demo.level1_V2;

public class 최대공약수와최소공배수 {

    static int gcd(int a, int b){
        while(b != 0){
            int r = a%b;
            a=b;
            b=r;
        }
        return a;
    }
    static  int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
    public int[] solution(int n, int m){
        int[] answer =new int[2];
        answer[0] = gcd(n,m);
        answer[1] = lcm(n,m);
        return answer;
    }
    public static void main(String[] args) {
        int n =3;
        int m =12;
        최대공약수와최소공배수 sol = new 최대공약수와최소공배수();
        System.out.println(        sol.solution(n,m)
        );
    }
}
