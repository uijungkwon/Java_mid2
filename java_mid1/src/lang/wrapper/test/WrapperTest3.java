package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args){
        String str = "100";
        Integer integer1 = Integer.valueOf(str);
        int intValue = integer1.intValue();
        Integer integer2 = Integer.valueOf(intValue);
        //valueOf() 는 괄호 안에 있는 값을 내꺼로 바꿔줌

        System.out.println("integer1 = " + integer1);
        System.out.println("intValue = " + integer1);
        System.out.println("integer2 = " + integer1);
    }
}
