package enumeraion.ref1;
public class DiscountService {
    public int discount(ClassGrade classGrade , int price){ //애초에 여기에 String 타입을 정해두면 안된다!!!!!
        int discountPercent = classGrade.getDiscountPercent();
        return price * discountPercent / 100;
    }
}
