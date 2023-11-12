package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args){
        //하나의 회원 객체를 만들어서 가입한 객체와 찾은 객체가 동일한지 테스트하기
        //(1)
        //AppConfig appConfig = new AppConfig();
        //MemberService memberService = appConfig.memberService();

        //(2)
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);//메소드 이름, 타입 을 매개변수로 저장


        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);

        System.out.println("new member = "+ member.getName());
        System.out.println("findMember = "+ findMember.getName());

    }
}
