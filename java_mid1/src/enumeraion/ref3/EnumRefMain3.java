package enumeraion.ref3;

public class EnumRefMain3 {
    public static void main(String[] args) {
        int price = 10000;
        Grade[] grades = Grade.values();
        for(Grade grade : grades){
            printDiscount(grade, price);
        }
        /*
        System.out.println("BASIC 등급의 할인 금액: " +Grade.BASIC.discount(price));
        System.out.println("GOLD 등급의 할인 금액: " + Grade.GOLD.discount(price));
        System.out.println("DIAMOND 등급의 할인 금액: " +Grade.DIAMOND.discount(price));*/
    }

    private static void printDiscount(Grade grade, int price){
        System.out.println(grade.name() + " 등급의 할인 금액: "+ grade.discount(price));
    }
}
