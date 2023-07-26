package sample;

import models.Cat;
import models.Dog;
import models.Veterinarian;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Veterinarian v = new Veterinarian();
        v.treatment(cat);
        v.treatment(dog);
    }
}