package lang.immutable.change;

import lang.immutable.address.ImmutableAddress;

public class ImmutableObj {
    private final int value;//불변 객체 생성
    public ImmutableObj(int value){
        this.value = value;
    }
    public ImmutableObj add(int addValue){
        int result = value + addValue; //아예 새로운 변수 생성
        ImmutableObj newObj = new ImmutableObj(result);
        return newObj;
    }
    public int getValue() {
        return value;
    }
}
