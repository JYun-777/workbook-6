package org.example.domain;

import org.example.interfaces.IAnimal;

public class Cat implements IAnimal {

    @Override
    public void makeSound(){
        System.out.println("meow");
    }
}
