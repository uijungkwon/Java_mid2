package enumeraion.ref2;

public enum Grade {
    BASIC(10), GOLD(20),DIAMOND(30);

    private final int discountPercent;

    Grade(int discountPercent){ //생성자
        this.discountPercent = discountPercent;
    }
    public int getDiscountPercent(){
        return discountPercent;
    }

}
