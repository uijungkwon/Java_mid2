package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {
    //Animal의 하위 타입도 전달할 수 있음
    public static void main(String[] args){
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        animalBox.set(dog);
        animalBox.set(cat); //맨 마지막에 저장된 것 출력 - 자동 오버라이딩

        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);
    }

}
