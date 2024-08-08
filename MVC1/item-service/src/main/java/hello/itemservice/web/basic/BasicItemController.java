package hello.itemservice.web.basic;

import hello.itemservice.domain.item.Item;
import hello.itemservice.domain.item.ItemRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/basic/items")
@RequiredArgsConstructor //생성자 자동 주입 코드
public class BasicItemController {
    private final ItemRepository itemRepository; //생성자 주입

    @GetMapping
    public String items(Model model){
        //아이템 목록 출력
        List<Item> items = itemRepository.findAll();
        model.addAttribute("items", items);
        return "basic/items"; //해당 이름을 가진 뷰 템플릿으로 이동
    }
    @GetMapping("/{itemId}")
    public String item(@PathVariable("itemId") Long itemId, Model model) { //-parameter 를 사용해야 에러가 없다!
        Item item = itemRepository.findById(itemId);
        model.addAttribute("item", item);
        return "basic/item";
    }
    @GetMapping("/add")
    public String addForm(){
        return "basic/addForm";
    }


    /**
     * 상품 등록
     * */
    //@PostMapping("/add")
    public String addItemV1(@RequestParam("itemName") String itemName,
                       @RequestParam("price") int price,
                       @RequestParam("quantity") Integer quantity,
                       Model model){
        Item item = new Item();
        item.setItemName(itemName);
        item.setPrice(price);
        item.setQuantity(quantity);

        itemRepository.save(item);

        model.addAttribute("item", item); //모델에 생성한 아이템을 추가함.

        return "basic/item";
    }
    //@PostMapping("/add")
    public String addItemV2(@ModelAttribute("item") Item item){
        //modelAttribute가 setxx로 item객체를 다 저장해줌

        itemRepository.save(item);

        //model.addAttribute("item", item); //모델에 생성한 아이템을 추가함.//이것도 자동 생성됨, 파라미터에 적은 이름으로 생성

        return "basic/item";
    }
    //@PostMapping("/add")
    public String addItemV3(@ModelAttribute Item item, Model model){
        //modelAttribute가 setxx로 item객체를 다 저장해줌

        itemRepository.save(item);

        //model.addAttribute("item", item); //모델에 생성한 아이템을 추가함.//이것도 자동 생성됨, 파라미터에 적은 이름으로 생성

        return "basic/item";
    }
    //@PostMapping("/add")
    public String addItemV4(Item item){
        itemRepository.save(item);
        return "basic/item";
    }
    //@PostMapping("/add")
    public String addItemV5(Item item) {
        itemRepository.save(item);
        return "redirect:/basic/items/" + item.getId();
    }
    @PostMapping("/add")
    public String addItemV6(Item item, RedirectAttributes redirectAttributes) {
        Item savedItem = itemRepository.save(item);
        redirectAttributes.addAttribute("itemId", savedItem.getId());
        redirectAttributes.addAttribute("status", true); //상품이 저장되었다는 의미의 표시
        return "redirect:/basic/items/{itemId}";
    }
    @GetMapping("/{itemId}/edit")
    public String editForm(@PathVariable("itemId") Long itemId, Model model){
        Item item = itemRepository.findById(itemId);
        model.addAttribute("item", item);
        return "basic/editForm";
    }
    @PostMapping("/{itemId}/edit")
    public String edit(@PathVariable("itemId") Long itemId, @ModelAttribute Item item){
        itemRepository.update(itemId,item);
        return "redirect:/basic/items/{itemId}";
    }


    //테스트용 아이템 추가
    @PostConstruct
    public void init(){
        //테스트용으로 아이템 미리 넣어두기
        itemRepository.save(new Item("itemA", 10000, 10));
        itemRepository.save(new Item("itemB", 20000, 50));
    }
}
