package nested.local;

public class LocalOuterV2 {
    private int outInstanceVar = 3;
    public void process(int paramVar)  {
        int localVar = 1;

        class LocalPrinter implements Printer { //인터페이스 구현도 가능
            int value = 0;
            @Override
            public void print() {
                System.out.println("value =" + value);
                System.out.println("localVar = " + localVar);
                System.out.println("parmaVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar); //지역 변수니까 모두 자기것 처럼 사용할 수 있음
            }
        }
        LocalPrinter printer = new LocalPrinter();
        printer.print();
    }
    public static void main(String[] args){
        LocalOuterV2 localOuter = new LocalOuterV2();
        localOuter.process(2);
    }
}
