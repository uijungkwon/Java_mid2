package jpa_basic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");//앱 로딩 시점에 딱 1개만 생성
        EntityManager em = emf.createEntityManager();
        /*코드 작성*/
        EntityTransaction tx = em.getTransaction(); //트랜잭션을 설정해야 작동함
        tx.begin();
        try {
            /*생성
            Member member = new Member();
            member.setId(2L);
            member.setName("kwon2");
            em.persist(member);//해당 member 객체를 DB에 등록
            */
            /*조회
            Member findMember = em.find(Member.class, 1L);
            System.out.println("findMember.id = "+findMember.getId());
            */
            /* 수정*/
            Member findMember = em.find(Member.class, 1L);
            findMember.setName("helloJPA");

            /*JPQL
            List<Member> result = em.createQuery("select m from Member as m", Member.class) //테이블이 아닌 "엔티티" 대상
                            .getResultList();
            for(Member member:result){
                System.out.println("member.name = " + member.getName());
            }*/

            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }
        /*코드 작성*/
        em.close();
    }
}