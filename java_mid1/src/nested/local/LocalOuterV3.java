package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {
    private int outInstanceVar = 3;
    public Printer process(int paramVar)  {
        int localVar = 1;//지역 변수는 스택 영역이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer { //인터페이스 구현도 가능 
            int value = 0;
            @Override
            public void print() {
                System.out.println("value =" + value);

                //인스턴스는 지역변수보다 더 오래 살아남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("parmaVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar); //지역 변수니까 모두 자기것 처럼 사용할 수 있음
            }
        }
        LocalPrinter printer = new LocalPrinter();
        //printer.print(); //여기서 실행하지않고 Printer인스턴스만 반환한다.ㄴ
        return printer;
    }
    public static void main(String[] args){
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);
        printer.print();

        //추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for(Field field : fields){
            System.out.println("field = " + field);
        }
    }
}
