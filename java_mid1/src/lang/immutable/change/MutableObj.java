package lang.immutable.change;

public class MutableObj {
    private int value;//변경할 수 있는 변수
    public MutableObj(int value){
        this.value = value;
    }

    public void add(int addValue){
        value = value + addValue;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
