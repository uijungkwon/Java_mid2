package nested.local;

public class LocalOuterV1 {
    private int outInstanceVar = 3;
    public void process(int paramVar) {
        int localVar = 1;

        class LocalPrinter {
            int value = 0;

            public void printData() {
                System.out.println("value =" + value);
                System.out.println("localVar = " + localVar);
                System.out.println("parmaVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar); //지역 변수니까 모두 자기것 처럼 사용할 수 있음
            }
        }
        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }
    public static void main(String[] args){
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);
    }
}
