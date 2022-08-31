package codej.programmers.demo.string;

public class lav2 {
    public static void main(String[] args) {
        String[] arr = new String[5];
        StringBuilder sb = new StringBuilder();
        int[] a = new int[]{1,2,3,4,5};
        int[] b = new int[]{2,3,4,5,6} ;
        for(int i=0; i<5; i++){
            int temp = a[i] | b[i];
            String binary = Integer.toBinaryString(temp);
            sb.append(binary);
            if(binary.length() < 5){
                sb.insert(0,"0");
            }
            System.out.println(sb);
            sb.setLength(0);
        }

    }
}
