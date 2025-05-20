package org.example.domain;

import org.example.interfaces.IAnimal;

public class Dog implements IAnimal {

    @Override
    public void makeSound(){
        System.out.println("woof");
    }
}
