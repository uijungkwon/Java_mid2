package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class OrderServiceImpl implements  OrderService{

    //철저하게 인터페이스에만 의존하고 있음
    private final MemberRepository memberRepository;//저장소 //final변수는 무조건 값이 할당 되어야함(변경 못하게) -> 생성자 주입
    private final DiscountPolicy discountPolicy;//할인정책

    // 생성자 주입
   @Autowired
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy){
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
