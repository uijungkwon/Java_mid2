package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        // 코드 작성
        String fileName = str.substring(0,str.indexOf(ext));//첫 글자를 포함하지 않고 자름
        System.out.println(fileName);
        String extName = str.substring(str.indexOf(ext));
        System.out.println(extName);
    }
}
