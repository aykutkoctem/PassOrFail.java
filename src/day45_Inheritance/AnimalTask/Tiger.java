package day45_Inheritance.AnimalTask;

import day45_Inheritance.AnimalTask.Animal;

public class Tiger extends Animal {

    public Tiger(String name, String breed, char gender, String size, int age, String color) {
        super(name, breed, gender, size, age, color);
    }

    public void roar(){
        System.out.println(name +" is roaring");
    }


}
