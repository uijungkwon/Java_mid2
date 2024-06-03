package lang.immutable.address;

public class ImmutableAddress {
    private final String value;

    public ImmutableAddress(String value){
        this.value = value; //final로 생성해서 한번 생성되면 변경 못하게 막음
    }
    public String getValue(){
        return value; //이 객체의 값은 한번만 설정 가능하지만 객체자체는 새롭게 생성 가능
    }
    //값을 변경할 수 있는 setValue를 제거함

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
