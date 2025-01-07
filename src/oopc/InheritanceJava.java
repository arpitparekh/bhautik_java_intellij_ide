package oopc;

class Animal{

    // default // public /// private // protected

    String type;
    String color;

    void noise(){
        System.out.println("Animal is making noise");
    }

}

class Dog extends Animal{
    String breed;

    void bark(){
        System.out.println("Dog is barking");
    }
}


public class InheritanceJava {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.color="Red";
        d.noise();
        d.bark();


    }
}
