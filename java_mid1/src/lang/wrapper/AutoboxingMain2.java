package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args){
        //primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; //기본형을 감싸준다.

        //Wrapper -> Primitive
        int unboxedValue = boxedValue;//감쌌던 것을 다시 풀 때
        System.out.println("boxedValue = "+ boxedValue);
        System.out.println("unboxedValue = "+ unboxedValue);
    }
}
