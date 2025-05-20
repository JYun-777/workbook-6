package org.example.domain;

import org.example.interfaces.IAnimal;
import org.example.interfaces.IFlyable;

public class Bird implements IAnimal, IFlyable {

    private String name = "";

    public Bird (){

    }

    public Bird (String name){
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("chirp");
    }

    @Override
    public void takeOff() {
        System.out.println("flap flap");
    }
}
