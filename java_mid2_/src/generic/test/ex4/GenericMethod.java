package generic.test.ex4;

public class GenericMethod {
    public static Object objMethod(Object obj){
        System.out.println("Object print: "+ obj);
        return obj;
    }
    //클래스 전체가 아니라 메서드에서만 제네릭 적용//
    public static <T> T genericMethod(T t){
        System.out.println("generic print: "+ t);
        return t;
    }
    public static <T extends Number> T numberMethod(T t){
        System.out.println("bound print: "+ t);
        return t;
    }
}
