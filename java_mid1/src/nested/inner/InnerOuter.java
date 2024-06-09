package nested.inner;

public class InnerOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;
    class Inner{ ///static이 붙지 않음 , 인스턴스가 됨
        private int innerInstanceValue = 1;
        public void print(){
            //자기 자신에 접근
            System.out.println(innerInstanceValue);
            
            //외부 클래스의 인스턴스 멤버에 접근 가능, private도 접근 가능

            System.out.println(outInstanceValue);

            System.out.println(outClassValue);
        }
    }
}
