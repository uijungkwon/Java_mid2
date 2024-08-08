package hello.core.order;

import hello.core.annotation.MainDiscountPolicy;
import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class OrderServiceImpl implements  OrderService{

    //생성자 주입을 사용하여 final 키워드 사용할 수 있음 -> 반드시 생성자 함수에서 값을 초기화 해주어야함(생성자 함수에서만 변경가능)
    private final MemberRepository memberRepository;//저장소 //final변수는 무조건 값이 할당 되어야함(변경 못하게) -> 생성자 주입
    private final DiscountPolicy discountPolicy;//할인정책
    // 생성자 주입 방식으로 사용한 코드
    //생성자 함수가 1개만 존재하면 @Autowired를 생략할 수 있다

    private DiscountPolicy rateDiscountPolicy; //여러개가 조회 되었을 때, Bean이름으로 조회할 수 있음
   @Autowired
    public OrderServiceImpl(MemberRepository memberRepository,@MainDiscountPolicy DiscountPolicy discountPolicy){
       //같은 Qulifier을 찾아서 값을 반환해준다.
       this.discountPolicy = discountPolicy;
       this.memberRepository = memberRepository;
    }

    @Override //주문 생성
    public Order createOrder(Long memberId, String itemName, int itemPrice){
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member,itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);//최종 생성된 주문을 반환함
    }
    //테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
