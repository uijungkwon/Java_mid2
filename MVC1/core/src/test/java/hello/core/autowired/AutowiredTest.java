package hello.core.autowired;

import hello.core.member.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

public class AutowiredTest {

    @Test
    void AutowiredOption(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean{

        @Autowired(required = false) //스프링과 관련없는걸 아무거나 집어넣음//기본 값은 true임
        public void setNoBean1(Member noBean1){

            System.out.println("noBean1 = "+ noBean1);//이거 자체가 호출이 안됨//의존관계가 없으면 메서드 자체가 호출되지 않음
        }

        @Autowired
        public void setNoBean2(@Nullable Member noBean2){
            System.out.println("noBean1 = "+ noBean2);
            //호출은 되지만 NUll값이 들어가게되는 것임
        }

        @Autowired
        public void setNoBean3(Optional<Member> noBean3){
            System.out.println("noBean1 = "+ noBean3);
            //스프링 빈이 없으면 .empty 값을 넣어줌.
        }

    }
}
