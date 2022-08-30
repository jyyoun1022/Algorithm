package codej.programmers.demo.level1;

public class 가운데_글자_가져오기 {
    public static void main(String[] args) {
        String s = "qwer";
        int index = s.length();
        StringBuilder sb = new StringBuilder();


            if(s.length() %2 != 0){
                sb.append(s.substring(index/2,index/2+1));
            }else{
                sb.append(s.substring(index/2-1,index/2+1));
        }
        System.out.println(sb);
    }
}
