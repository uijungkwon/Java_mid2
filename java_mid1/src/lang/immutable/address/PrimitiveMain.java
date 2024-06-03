package lang.immutable.address;

public record PrimitiveMain() {
    public static void main(String[] args){
        //기본형은 절대로 같은 값틀 공유하지 않는다.//종이에 값을 똑같이 쓰는것 과 같음
        int a = 10;
        int b = a;//  a-> b , 값 복사 후 대입
        System.out.println("a = "+ a);
        System.out.println("b = "+b);

        b = 20;
        System.out.println("20 -> b"+b);
        System.out.println("a = "+a);
        System.out.println("b = "+ b);


    }
}
