package generic.ex1;

public class BoxMain2 {
    //Object Box 하나로 모든게 다 해결이 가능
    //하지만 타입 안정성이 낮음
    public static void main(String[] args){
        ObjectBox integerBox = new ObjectBox();//부모는 자식을 품을 수 있다.
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); // Object -> Integer 캐스팅
        System.out.println("integer = "+ integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();
        System.out.println("str = "+ str);

        //문제점 - 잘못된 타입의 인수 전달시
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get(); //String -> Integer
        System.out.println("result = " + result);
    }
}
