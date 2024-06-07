package enumeraion.ex1;

public class DiscountService {
    public int discount(String grade , int price){ //애초에 여기에 String 타입을 정해두면 안된다!!!!!
        int discountPercent = 0;
        if(grade.equals(StringGrade.BASIC)){
            discountPercent = 10;
        }
        else if(grade.equals(StringGrade.GOLD)){
            discountPercent = 20;
        }
        else if(grade.equals(StringGrade.DIAMOND)){
            discountPercent = 30;
        }
        else System.out.println(grade + ": 할인X");
        return price * discountPercent / 100;
    }

}
