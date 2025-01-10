package oopc;

abstract class Vehicle{
    abstract void drive();
}

abstract class Car extends Vehicle{
    @Override
    void drive() {

    }
}

interface A3{
    void method1();
}
interface B3 extends A3{
    void method2();
}

class c3 implements B3{

    @Override
    public void method2() {

    }

    @Override
    public void method1() {

    }
}


class Garage extends Car{


}


class Tv{
    int a;
}

class Mobile extends Tv implements B3,A3{

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}
public class AbstractionSenarios {

    static Tv method1(){
        return new Tv();
    }


    public static void main(String[] args) {

        // class
        // object
        // constructor
        // inheritance
        // this super static final
        // finalize() // GC
        // polymorphism
        // abstraction
        // encapsulation

        method1().a = 23;


    }
}
