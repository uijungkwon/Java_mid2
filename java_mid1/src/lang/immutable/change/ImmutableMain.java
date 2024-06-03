package lang.immutable.change;

public class ImmutableMain {
    public static void main(String[] args){
      ImmutableObj obj =   new ImmutableObj(10);// 같은객체에서 값을 변경할 수는 없다.
      ImmutableObj newObj = obj.add(20);

      System.out.println("obj = " + obj.getValue());
      System.out.println("obj = " + newObj.getValue()); //핵심: 아예 새로운 값 생성

    }
}
