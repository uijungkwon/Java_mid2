package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        // 코드 작성
        int count = 0;
        int index =str.indexOf(key);//처음에 시작할 인덱스 값
        while(index >= 0){//문자열을 벗어나면 -1값을 가진다!
            index = str.indexOf(key, index +1);
            count++;
        }
        System.out.println("count = "+count);
    }
}
