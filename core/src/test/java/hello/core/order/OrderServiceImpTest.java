package hello.core.order;

import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemoryMemberRepository;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OrderServiceImpTest {
    //스프링 없이 자바 코드로만 구현해서 테스트에 성공함
    @Test
    void createOrder(){
        MemoryMemberRepository memberRepository = new MemoryMemberRepository();
        memberRepository.save(new Member(1L, "name", Grade.VIP));//테스트 위해 회원 가입 진행

        OrderServiceImpl orderService = new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
        Order order = orderService.createOrder(1L, "itemA", 10000);
        assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
