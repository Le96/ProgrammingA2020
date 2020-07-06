package lec08.city;

import lec08.animal.Animal;
import lec08.animal.Cat;
import lec08.animal.Dog;

public class House {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog();
        animals[1] = new Dog();
        animals[2] = new Dog();
        animals[3] = Cat.getInstance();
        // animals[3] = new Cat();
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].say());
        }
    }
}