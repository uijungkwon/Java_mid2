package lang.immutable.address;

public class MemberV2 {
    private String name;
    private ImmutableAddress address;

    public MemberV2(String name, ImmutableAddress address){
        this.name = name;
        this.address = address;
    }
    public ImmutableAddress getAddress(){
        return address; //address 객체를 가져옴
    }

    public void setAddress(ImmutableAddress address) {
        this.address = address;
    }
    //새로운 주소 객체를 생성해서 넣어줌
    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

}
