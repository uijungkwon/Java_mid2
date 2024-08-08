package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2<T>{
    AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
    AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
    //Animal과 관련되지 않은 타입도 들어올 수 있음.
    AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
    AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();

}
