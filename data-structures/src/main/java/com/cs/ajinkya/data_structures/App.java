package com.cs.ajinkya.data_structures;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Human tom = new Human("Ajinkya", 26, 180, "black");
        tom.speak();
        tom.walk();
        tom.eat();
        tom.work();
        System.out.println(tom); // this will call toString method on the object
        
        Animal animal = new Animal(10, "Male", 100);
        animal.eat();
        animal.sleep();
        System.out.println(animal);
    }
}
