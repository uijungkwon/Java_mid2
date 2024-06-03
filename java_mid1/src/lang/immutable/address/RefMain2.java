package lang.immutable.address;

public class RefMain2 {
   public static void main(String[] args){
       //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
       ImmutableAddress a = new ImmutableAddress("서울");
       ImmutableAddress b = a; //a와 b 둘다 같은 주소를 가리키게됨 (같은 집주소 가짐 -동시에 변경 )
       System.out.println("a = "+a);
       System.out.println("b = "+b);

       //새로운 값 대입 불가
       //b.setValue("부산");//주소를 바꾼게 아니라 value(멤버 값)을 바꿈
                        // A와 B는 같은 주소를 가리킴

       System.out.println("부산 -> b");// 절대 안바뀜 !

       System.out.println("a = "+a);//각각의 value 참조
       System.out.println("b = "+ b);
   }
}
