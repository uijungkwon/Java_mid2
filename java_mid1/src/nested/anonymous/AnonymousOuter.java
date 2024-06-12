package nested.anonymous;
import nested.local.Printer;
public class AnonymousOuter {

    private int outInstanceVar = 3;
    public void process(int paramVar) {
        int localVar = 1;
        Printer printer = new Printer() {//익명 클래스는 클래스 생성하면서 객체 생성 가능
            int value = 0;
            @Override
            public void print() {
                System.out.println("value=" + value);
                System.out.println("localVar=" + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInstanceVar=" + outInstanceVar);
            }
        };
        printer.print();
        System.out.println("printer.class=" + printer.getClass());
    }
    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
