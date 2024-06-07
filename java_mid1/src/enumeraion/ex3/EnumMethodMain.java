package enumeraion.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args){
        //모든 ENUM 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));//String 타입으로 변환
        for(Grade value: values){
            System.out.println("name = "+ value.name() + ", ordinal = "+ value.ordinal());
        }

        //String -> Enum 변환
        String input = "GOLD";
        Grade gold = Grade.valueOf(input); //String -> Enum
        System.out.println("gold = " + gold);
    }
}
