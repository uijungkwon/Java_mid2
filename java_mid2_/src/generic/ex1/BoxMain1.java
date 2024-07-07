package generic.ex1;

public class BoxMain1 {
    public static void main(String[] args){
        //중복은 많지만 타입 안정성이 높다
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10);//오토 박싱
        Integer integer = integerBox.get();
        System.out.println("integer = "+ integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");//오토 박싱
        String str = stringBox.get();
        System.out.println("str = "+ str);
    }
}
