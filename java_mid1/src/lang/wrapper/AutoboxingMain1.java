package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args){
        //primitive -> Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value); //기본형을 감싸준다.

        //Wrapper -> Primitive
        int unboxedValue = boxedValue.intValue();//감쌌던 것을 다시 풀 때
        System.out.println("boxedValue = "+ boxedValue);
        System.out.println("unboxedValue = "+ unboxedValue);
    }
}
