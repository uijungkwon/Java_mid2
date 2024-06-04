package lang.string.test;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";
        // 코드 작성
        String reversed = new StringBuilder(str).reverse().toString();//다시 String 형으로 변환하기
        System.out.println(reversed);
    }
}
