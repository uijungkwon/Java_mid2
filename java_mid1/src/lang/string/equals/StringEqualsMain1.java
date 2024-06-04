package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args){
        String str1 = new String("hello");//다른 새로운 객체를 생성
        String str2 = new String("hello");
        System.out.println("new String() == 비교: "+ (str1 == str2)); //객체가 같은지 확인
        System.out.println("new String() equals 비교:" + (str1.equals(str2)));//내용이 같은지 확인

        String str3 = "hello";
        String str4 = "hello";

        // 같은 문자열이 있으면 pool에 있는지 확인하고 똑같은게 있으면 새롭게 만들지 않음
        System.out.println("new String() == 비교: "+ (str3 == str4)); //객체가 같은지 확인
        System.out.println("new String() equals 비교:" + (str3.equals(str4)));//내용이 같은지 확인
    }
}
