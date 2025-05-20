package org.example;

import org.example.domain.Bird;
import org.example.domain.Cat;
import org.example.domain.Dog;
import org.example.domain.Eagle;
import org.example.interfaces.IFlyable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog fido = new Dog();
        fido.makeSound();
        Cat mewmew = new Cat();
        mewmew.makeSound();
        Bird tweety = new Bird();
        tweety.makeSound();
        tweety.takeOff();

        List<IFlyable> flyers = new ArrayList<>();
        flyers.add(new Bird("Harold"));
        flyers.add(new Eagle());


        for (IFlyable f : flyers) {
            f.takeOff();  // all fly differently, but we treat them the same!
        }
    }
}