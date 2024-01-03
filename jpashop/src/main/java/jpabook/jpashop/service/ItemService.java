package jpabook.jpashop.service;

import jpabook.jpashop.domain.item.Book;
import jpabook.jpashop.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import jpabook.jpashop.domain.item.Item;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;
    @Transactional //"저장" 해야하니까 얘만 애노테이션 선택
    public void saveItem(Item item){
        itemRepository.save(item);
    }
    @Transactional
    public Item updateItem(Long itemId, Book bookParam){
        Item item = itemRepository.findOne(itemId); //영속 상태
        item.setPrice(bookParam.getPrice());
        item.setName(bookParam.getName());
        item.setStockQuantity(bookParam.getStockQuantity());
        return item;
    }

    public List<Item> findItems(){
        return itemRepository.findAll();
    }
    public Item findOne(Long itemId){
        return itemRepository.findOne(itemId);
    }
}
