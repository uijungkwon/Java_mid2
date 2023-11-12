package hello.core;
import hello.core.discount.DiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }
    @Bean
    public OrderService orderService() { //Bean을 붙이면 이 함수들이 컨테이너에 자동 저장된다.메서드 이름으로 등록됨
        return new OrderServiceImpl(memberRepository(),discountPolicy());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();// 구현체 설정
    }
    @Bean
    public DiscountPolicy discountPolicy() {
        //return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}