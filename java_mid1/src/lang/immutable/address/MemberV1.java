package lang.immutable.address;

public class MemberV1 {
    private String name;
    private Address address;

    public MemberV1(String name, Address address){
        this.name = name;
        this.address = address;
    }
    public Address getAddress(){
        return address; //address 객체를 가져옴
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

}
