package lang.clazz;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception{
        //Class 조회
        Class clazz = String.class;
        //Class clazz2 = new String().getClass();//인스턴스에서 조회
        //Class clazz3 = Class.forName("java.lang.Strig");


        //모든 필드 출력
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields){
            System.out.println("field = "+field.getType());
        }

        //모든 메서드 출력
        //Method[] methods = clazz.getDeclaredFields();

    }
}
