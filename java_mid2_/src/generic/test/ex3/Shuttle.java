package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class Shuttle <T extends BioUnit>{
    //실체를 나타낼 객체 하나는 생성해놓음.
    private T unit;
    public void in(T t){
        unit = t;
    }
    public void showInfo(){
        System.out.println("이름: " +  unit.getName()+ ", HP: " + unit.getHp());
    }
}
