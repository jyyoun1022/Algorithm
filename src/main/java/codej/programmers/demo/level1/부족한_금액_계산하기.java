package codej.programmers.demo.level1;

import lombok.extern.slf4j.Slf4j;

public class 부족한_금액_계산하기 {
    public static void main(String[] args) {
        //놀이기구 이용료 price
        //N번 이용 count
        //가지고 있던 금액 mondy
        //현재가지고 있는 금액에서 놀이기구를 count번 타게 되면 금액에서 얼마가 모자라는지 return
        //단 금액이 부족하지 않다면 0을 리턴

        int price =3;
        long money =20;
        int count =4;
        int sum =0;

        long answer = 0;

        //money - (price *count) = 0? 0 : -금액을 리턴

        for(int i=1; i<=count; i++) {
            sum += (price);
            money = money - sum;

           if(money == 0){
               answer = Math.abs(money);
           } else if (money <0) {
               answer = Math.abs(money);
           }
        }


        System.out.println(answer);
    }
}
