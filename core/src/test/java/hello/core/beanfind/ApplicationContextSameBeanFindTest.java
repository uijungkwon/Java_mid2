package hello.core.beanfind;

import hello.core.AppConfig;
import hello.core.discount.DiscountPolicy;
import hello.core.member.*;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ApplicationContextSameBeanFindTest {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SameBeanConfig.class);

    @Test
    @DisplayName("타입으로 조회 시 같은 타입이 둘 이상 있으면, 중복 오류가 발생한다.")
    void findBeanByDuplicate(){
        //ac.getBean(MemberRepository.class); //여기서 오류가 발생함
        assertThrows(NoUniqueBeanDefinitionException.class,
                ()-> ac.getBean(MemberRepository.class));
    }
    @Test
    @DisplayName("타입으로 조회시 같은 타입이 둘 이상 있으면, 빈 이름을 지정하면 된다.")
    void findBeanByName(){
            MemberRepository memberRepository = ac.getBean("memberRepository1", MemberRepository.class);
            org.assertj.core.api.Assertions.assertThat(memberRepository).isInstanceOf(MemberRepository.class);

    }

    @Test
    @DisplayName("특정 타입을 모두 조회하기")
    void findAllBeanByType(){
        Map<String, MemberRepository> beansOfType= ac.getBeansOfType(MemberRepository.class);
        for(String key: beansOfType.keySet()){
            System.out.println("key = "+ key + "value = " + beansOfType.get(key));

        }
        System.out.println("beansOfType = " + beansOfType);
        org.assertj.core.api.Assertions.assertThat(beansOfType.size()).isEqualTo(2);
    }

    @Configuration
    static class SameBeanConfig{ //해당 파일 내에서만 사용가능함//예제로 같은 타입인 Bean 2개 생성

        @Bean
        public MemberRepository memberRepository1(){
            return new MemoryMemberRepository();
        }
        @Bean
        public MemberRepository memberRepository2(){ //위와 타입이 같음
            return new MemoryMemberRepository();
        }

    }
}
