package enumeraion.ref2;
public class DiscountService {
    public int discount(Grade grade , int price){ //애초에 여기에 String 타입을 정해두면 안된다!!!!!
        int discountPercent = grade.getDiscountPercent();

        return price * discountPercent / 100;
    }
}
