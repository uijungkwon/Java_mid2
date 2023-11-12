package hello.core.member;

public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository;
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
}
