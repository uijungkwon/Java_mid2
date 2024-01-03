package jpa_basic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Member")//테이블이름 따로 지정 가능
public class Member {
    @Id //jpa에게 primary key라고 알려줌
    private Long id;
    //@Column(name = "username")//컬럼명도 따로 지정 가능
    private String name;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
       this.id =  id;
    }
    public String getName(){
        return name;
    }public void setName(String name){
        this.name = name;
    }


}
