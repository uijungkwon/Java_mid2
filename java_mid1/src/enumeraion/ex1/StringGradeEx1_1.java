package enumeraion.ex1;
public class StringGradeEx1_1 {
    public static void main(String[] args){
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(StringGrade.BASIC, price);
        int gold = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);

        //존재하지 않는 등급
        int vip = discountService.discount("sdf", price);
        System.out.println("VIP 등급의 할인 금액 : "+ vip);

        System.out.println("BASIC 등급의 할인 금액 : "+ basic);
        System.out.println("GOLD 등급의 할인 금액 : "+ gold);
        System.out.println("DIAMOND 등급의 할인 금액 : "+ diamond);
    }
}
