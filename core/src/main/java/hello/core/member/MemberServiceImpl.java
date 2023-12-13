package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository;
    @Autowired //ac.getBean(MemberRepository.class)
    public MemberServiceImpl(MemberRepository memberRepository){
        this.memberRepository= memberRepository;
    }
    //회원 서비스 : 회원 가입, 조회
    @Override
    public void join(Member member){
        memberRepository.save(member); //다형성에 의해서 MemoryMemberRepository객체가 불려옴
    }
    @Override
    public Member findMember(Long memberId){
        return memberRepository.findById(memberId);
    }

    //테스트 용도
    public MemberRepository getMemberRepository(){
        return memberRepository;
    }
}
