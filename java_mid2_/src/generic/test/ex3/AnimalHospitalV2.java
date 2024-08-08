package generic.test.ex3;

import generic.animal.Animal;

public class AnimalHospitalV2<T> {
    private T animal;
    public void set(T animal) {
        this.animal = animal;
    }
    public void checkup() {
        //컴파일 오류 : T의 타입 메서드를 정의하는 시점에는 알 수 없다.
        //T가 무슨 타입으로 들어올지 모르는데, getName() 함수를 사용할 수 있는지 잘 모르니까 컴파일 오류 발생 -> Object의 기능만 사용
        animal.toString();
        animal.equals(null);

        //System.out.println("동물 이름: " + animal.getName());
        //System.out.println("동물 크기: " + animal.getSize());
        //animal.sound();
    }
    /*public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }*/

}
