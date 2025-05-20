package org.example.domain;

import org.example.interfaces.IAnimal;
import org.example.interfaces.IFlyable;

public class Eagle implements IFlyable, IAnimal {
    @Override
    public void takeOff() {
        System.out.println("Big Flap");
    }

    @Override
    public void makeSound() {
        System.out.println("Screech");
    }
}
