package oopc;

class Parent{

    Parent(String name){
        System.out.println("Parent Constructor => " + name);
    }
}

class Child extends Parent{

    Child(String name){
        super(name);   // always first statement
        System.out.println("Child Constructor");
    }
}

public class InheritanceWithConsturctor {

    public static void main(String[] args) {

        // this  // current class instance(object)
        // super // parent class instance (object)

        // child class parameterized or default constructor always called parent class default
        // only constructor

        Child c = new Child("Sumit");

    }

}
