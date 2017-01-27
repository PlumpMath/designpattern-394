package com.joseoliveros.strategy;

public abstract class Duck {

    public void quack() {
        System.out.println("El pato hace quack");
    }

    public void swim() {
        System.out.println("El pato nada");
    }

    public abstract void display();
}
