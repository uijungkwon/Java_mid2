package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args){
        //생성 시점에 T의 타입 결정
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.set(10);
         Integer integer = integerBox.get();
        //integerBox.set("문자");//Integer타입만 허용, 컴파일 오류
        System.out.println("integer = " + integer);

        GenericBox<String> str = new GenericBox<String>();
        str.set("hello");
        String s = str.get();
        System.out.println("str = "+ str);

        //타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> interBox2 = new GenericBox<>();//여기는 타입 추론

    }
}
