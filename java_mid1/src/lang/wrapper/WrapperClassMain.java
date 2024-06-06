package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args){
        Integer newInteger = new Integer(10);//직접 사용 금지  곧 삭제될 예정임
        Integer integerObj = Integer.valueOf(10);//-128~127 자주 사용하는 숫자 값 채용
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = "+ newInteger);
        System.out.println("integerObj = "+ integerObj);
        System.out.println("longObj = "+ longObj);
        System.out.println("doubleObj = "+ doubleObj);



    }
}
