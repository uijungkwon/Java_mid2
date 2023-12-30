package jpabook.jpashop.service;
import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
@RunWith(SpringRunner.class)//junit 실행할 때 스프링과 함께 실행
@SpringBootTest //스프링부트 실행
@Transactional // 테스트 끝난 후 자동 롤백 시킴
public class MemberServiceTest {
    @Autowired MemberService memberService;
    @Autowired MemberRepository memberRepository;
    @Test
    //@Rollback(false)//원래는 자동으로 롤백 됨
    public void 회원가입() throws Exception {
        //Given
        Member member = new Member();
        member.setName("kim");
        //When
        Long saveId = memberService.join(member);
        //Then
        assertEquals(member, memberRepository.findOne(saveId));
    }
    @Test(expected = IllegalStateException.class) //예외를 설정
    public void 중복_회원_예외() throws Exception {
        //Given
        Member member1 = new Member();
        member1.setName("kim");

        Member member2 = new Member();
        member2.setName("kim");
        //When
        memberService.join(member1);
        memberService.join(member2); //예외가 발생해야 한다.(같은 이름을 넣음)
        //Then
        fail("예외가 발생해야 한다.");//여기까지 코드가 오지 않도록, fail 명령문을 작성
    }
}
