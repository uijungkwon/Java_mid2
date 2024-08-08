package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp { //main 메소드 보다 test 파일을 생성해서 테스트하는게 더 좋음
    public static void main(String[] args){
        //AppConfig appConfig = new AppConfig();
        //MemberService memberService = appConfig.memberService();
        //OrderService orderService = appConfig.orderService();

        //이전의 코드 : OrderService orderService = new OrderServiceImpl(null);

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService",MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

        Long memberId = 1L;
        Member member = new Member(memberId, "uijung", Grade.VIP);//회원 객체 생성
        memberService.join(member); //회원 가입

        Order order = orderService.createOrder(memberId, "itemA", 20000);//주문 생성
        System.out.println("order = " + order);//완성된 주문 출력
    }
}
