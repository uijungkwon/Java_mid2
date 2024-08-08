package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args){
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 200);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        //문제1: 개 병원에 고양이 전달
        dogHospital.set(cat) ;//매개변수 체크 실패: 상위 타입을 사용했기 때문에

        //문제2: 개 타입 반환, 캐스팅이 필요함(현재 Animal로 만든 상황이니까)
        dogHospital.set(dog);
        Dog biggerDog =(Dog) dogHospital.bigger(new Dog("멍멍이2", 400));//animal타입으로 반환돼서 다운 캐스팅을 해야한다.
        System.out.println("biggerDog = "+ biggerDog);
    }
}
