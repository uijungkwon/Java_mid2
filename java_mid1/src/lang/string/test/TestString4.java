package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String fileName = str.substring(0,5); //마지막 포함 안함
        String extName = str.substring(5);

        System.out.println("fileName = "+ fileName);
        System.out.println("extName = "+ extName);
    }
}
