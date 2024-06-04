package lang.string.immutable;

public class StringImmutable2 {
    public static void main(String[] args){
        String str = "hello";
        String str2 = str.concat("java"); //반환값을 가져야 함
        System.out.println("str = " + str2);
    }
}
