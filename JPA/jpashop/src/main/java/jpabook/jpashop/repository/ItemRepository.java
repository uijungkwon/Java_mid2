package jpabook.jpashop.repository;

import jakarta.persistence.EntityManager;
import jpabook.jpashop.domain.item.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor //생성자 함수 대신 작성(생성자 의존 주입)
public class ItemRepository {
    private final EntityManager em;
    public void save(Item item){
        if(item.getId() == null){ //item은 jpa 저장하기 전까지 id가 없음, 여기서 id를 가져온다는 것은 아예 "새로운 객체"를 생성한다는 의미
            em.persist(item);
        }
        else{
            em.merge(item);
        }
    }
    public Item findOne(Long id){
        return em.find(Item.class, id);
    }
    public List<Item> findAll(){
        return em.createQuery("select i from Item i", Item.class)//아이템을 여러개 찾을 땐 jpa 사용
        .getResultList();
    }
}
