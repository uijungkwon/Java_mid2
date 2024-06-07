package enumeraion.ex3;
public class DiscountService {
    public int discount(Grade classGrade , int price){ //애초에 여기에 String 타입을 정해두면 안된다!!!!!
        int discountPercent = 0;

        if(classGrade == Grade.BASIC){
            discountPercent = 10;
        }
        else if(classGrade == Grade.GOLD){
            discountPercent = 20;
        }
        else if(classGrade == Grade.DIAMOND){
            discountPercent = 30;
        }
        else System.out.println("할인X");
        return price * discountPercent / 100;
    }
}
