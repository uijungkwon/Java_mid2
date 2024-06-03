package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args){
       Address address =  new Address("서울"); //두 회원은 같은 주소 참조
        MemberV1 memberA = new MemberV1("회원A", address);
        MemberV1 memberB = new MemberV1("회원B", address);

        //회원A, 회원 의 처음 주소는 모두 서울
        System.out.println("memberA = "+ memberA);
        System.out.println("memberB = "+ memberB);

        //회원 B의 주소를 부산으로 변경해야함
        //A와 B둘다 부산으로 주소가 변경됨
        memberB.getAddress().setValue("부산");
        System.out.println("부산 -> memberB.address ");
        System.out.println("memberA = "+ memberA);
        System.out.println("memberB = "+ memberB);
    }
}
