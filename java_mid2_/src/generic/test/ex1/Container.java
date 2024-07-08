package generic.test.ex1;

public class Container<T>{ //끼워넣을 수 있는 값 찾기
    private T item;
    public boolean isEmpty(){
        return item == null; //빈 값인지 확인
    }

    public void setItem(T item){
        this.item =item;
    }
    public T getItem(){
        return item;
    }
}
