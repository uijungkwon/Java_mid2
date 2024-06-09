package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args){
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner();//어느 인스턴스의 소속인지알 수 있음
        inner.print();

        System.out.println("innerClass = " + inner.getClass());


    }
}
