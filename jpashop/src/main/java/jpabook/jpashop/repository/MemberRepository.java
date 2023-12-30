package jpabook.jpashop.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jpabook.jpashop.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //컴포넌트 자동 스캔 -> 스프링 기반 예외로 변환
@RequiredArgsConstructor
public class MemberRepository {
    @PersistenceContext
    private EntityManager em;// 스프링이 매니저를 만들어서 주입시킴
   /* public MemberRepository(EntityManager em){
        this.em = em;
    }*/
    public void save(Member member){
        em.persist(member);//JPA가 멤버 엔터티 주입
    }
    public Member findOne(Long id){
      return  em.find(Member.class, id);
    }

    public List<Member> findAll(){
        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }
    public List<Member> findByName(String name){
        return em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();
    }
}
