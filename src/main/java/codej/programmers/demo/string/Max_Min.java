package codej.programmers.demo.string;

public class Max_Min {
    public static void main(String[] args) {
        int[] numbers =new int[]{10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
        int min =numbers[0];
        int max =numbers[0];

        int minIdx = 0;
        int maxIdx = 0;

        for(int i=0; i< numbers.length; i++){
            if(max<numbers[i]){
                max=numbers[i];
                maxIdx= i+1;
            }
            if(min > numbers[i]){
                min = numbers[i];
                minIdx = i+1;
            }

        }
        System.out.println(max);
        System.out.println(maxIdx);
        System.out.println(min);
        System.out.println(minIdx);
    }
}
