package impl;

public class Animal {

    public class Camel{
        void makeSound(){
            System.out.println("Camel made a sound");
        }
    }


    public static class Cat{
        static void makeSound(){
            System.out.println("Meow");
        }
    }


    static void testStatic(){
        Cat.makeSound();
    }

    void makeSoundsOfAnimals(){
        Camel camel = new Camel();
        camel.makeSound();
    }


}
