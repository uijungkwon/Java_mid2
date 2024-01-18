package hello.itemservice.domain.item;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ItemRepository {
    //실무에서 여러개가 접근할 때 HashMap으로 절대 접근하면 안돼!!!
    private static final Map<Long, Item> store = new HashMap<>();//static 사용 //(아이디, 아이템) 꼴로 저장
    private static long sequence = 0L; //static //저장 되는 순서

    public Item save(Item item){
        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }
    public Item findById(Long id){
        return store.get(id);
    }
    public List<Item> findAll(){
        return new ArrayList<>(store.values());// 한번 감싸서 반환하면, 실제 store에는 변환이 없기 떄문에 안전하게 감쌈
    }
    public void update(Long itemId, Item updateParam){ //상품 업데이트(수정)
        Item findItem = findById(itemId);
        findItem.setItemName(updateParam.getItemName());
        findItem.setPrice(updateParam.getPrice());
        findItem.setQuantity(updateParam.getQuantity());
    }
    public void clearStore(){
        store.clear();// 모든 해쉬맵 삭제
    }
}

