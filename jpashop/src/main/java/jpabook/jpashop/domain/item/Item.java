package jpabook.jpashop.domain.item;

import jakarta.persistence.*;
import jpabook.jpashop.domain.Category;
import jpabook.jpashop.exception.NotEnoughStockException;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //한 테이블에 모두 넣기
@DiscriminatorColumn(name = "dtype") //저장할 때 구분하기 위한 용도(북, 무비, 앨범)
@Getter @Setter
public abstract class Item {
    @Id @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;

    @ManyToMany(mappedBy = "items")
    private List<Category> categories = new ArrayList<>();

    //==비즈니스 로직 ==//
    /*재고 증가*/
    public void addStock(int quantity){ //핵심 비즈니스 메서드로 멤버 아이템(quantity)을 변경해야한다.
        this.stockQuantity += quantity;
    }

    /*재고 감소*/
    public void removeStock(int quantity){
        int restStock = this.stockQuantity - quantity;
        if(restStock <0){
            throw new NotEnoughStockException("need more stock");//잔여량이 0 미만으로 내려가면 예외 터트림
        }
        this.stockQuantity = restStock;
    }
}
