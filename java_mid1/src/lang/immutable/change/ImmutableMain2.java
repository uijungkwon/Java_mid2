package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args){
      ImmutableObj obj =   new ImmutableObj(10);// 같은객체에서 값을 변경할 수는 없다. 
      obj.add(20);//기존 객체는 전혀 바뀌지 않음 (return 값 받지 않음

      System.out.println("obj = " + obj.getValue()); //핵심: 아예 새로운 값 생성

    }
}
