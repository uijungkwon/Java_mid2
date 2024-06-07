package enumeraion.ex2;

import enumeraion.ex1.StringGrade;

public class DiscountService {
    public int discount(ClassGrade classGrade , int price){ //애초에 여기에 String 타입을 정해두면 안된다!!!!!
        int discountPercent = 0;

        if(classGrade == ClassGrade.BASIC){
            discountPercent = 10;
        }
        else if(classGrade == ClassGrade.GOLD){
            discountPercent = 20;
        }
        else if(classGrade == ClassGrade.DIAMOND){
            discountPercent = 30;
        }
        else System.out.println("할인X");
        return price * discountPercent / 100;
    }
}
