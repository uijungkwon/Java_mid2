package hello.itemservice.domain.item;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
//스프링 없이 테스트
class ItemRepositoryTest {
    ItemRepository itemRepository = new ItemRepository();
    @AfterEach
    void afterEach(){
        itemRepository.clearStore(); //테스트 할 때 마다 데이터 삭제
    }
    @Test
    void save(){
        //given
        Item item = new Item("케이크", 10000, 10);
        //when
        Item savedItem = itemRepository.save(item);
        //then
        Item findItem = itemRepository.findById(item.getId());
        Assertions.assertThat(findItem).isEqualTo(savedItem);
    }
    @Test
    void findAll(){
        //given
        Item item1 = new Item("케이크", 10000, 10);
        Item item2 = new Item("쿠키", 1000, 5);

        itemRepository.save(item1);
        itemRepository.save(item2);
        //when
        List<Item> result = itemRepository.findAll();
        //then
        Assertions.assertThat(result.size()).isEqualTo(2); //아이템 2개 저장했으니까
    }
    @Test
    void updateItem(){
        //given
        Item item = new Item("케이크", 10000, 10);
        Item savedItem = itemRepository.save(item);
        Long itemId = savedItem.getId();
        //when
        Item updateParam = new Item("item2", 20000, 30);
        itemRepository.update(itemId, updateParam); //새로운 객체로 덮어씌우기
        //then
        Item findItem = itemRepository.findById(itemId);
        Assertions.assertThat(findItem.getItemName()).isEqualTo(updateParam.getItemName());
        Assertions.assertThat(findItem.getPrice()).isEqualTo(updateParam.getPrice());
        Assertions.assertThat(findItem.getQuantity()).isEqualTo(updateParam.getQuantity());
    }
}