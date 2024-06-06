package lang.system;

import java.util.Arrays;

public class SystemMain { //시스템 정보 출력 하는 클래스 //System 클래스 사용!
    public static void main(String[] args){
        //현재 시간을 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = "+ currentTimeMillis);

        //현재 시간을 가져온다.
        long currentNanoTime = System.nanoTime();
        System.out.println("currentNanoTime = "+ currentNanoTime);

        //환경 변수를 읽는다. ex) 자바 경로
        System.out.println("getenv = "+ System.getenv());

        //시스템 속성을 읽는다.
        System.out.println("properties = "+ System.getProperties());
        System.out.println("java version: "+ System.getProperty("java.version"));

        //배열을 고속으로 복사한다.
        char[] originalArray =  new char[] {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        //운영체제가 시스템 레벨에 던져 버림 -> 배열 고속 복사
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        //배열 출력
        System.out.println("copiedArray = "+ copiedArray);
        System.out.println("copiedArray = "+ Arrays.toString(copiedArray));

        //프로그램 종료
        System.exit(0);
        System.out.println("hello");
    }
}
