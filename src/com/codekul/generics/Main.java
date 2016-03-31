/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.generics;

/**
 *
 * @author aniruddha
 */
public class Main {

    public static void main(String[] args) {
        
        Car car = new Car();
        
        Animal animal = new Animal();
        
        String str = new String();
        
        Any any = new Any();
        any.acceptAnything(car);
        any.acceptAnything(animal);
        any.acceptAnything(str);
        any.acceptAnything(new Runnable() {
            @Override
            public void run() {
            }
        });
        
        FullAny<Car> carFull = new FullAny<>();
        carFull.acceptAnything(car);
        
        FullAny<Animal> animalFull = new FullAny<>();
        animalFull.acceptAnything(animal);
        
        CarFullAny carFullAny = new CarFullAny();
        carFullAny.acceptAnything(car);
    }
}
