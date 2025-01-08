package oopc;

class Outer{
    int out;
    static class Inner{
        int in;
    }

    static void fun(String name){
        System.out.println(name + " is having fun");
    }

}

public class NestedClass {

    static int a;

    public static void main(String[] args) {

        // nested class
        Outer out = new Outer();

        Outer.Inner inObj = new Outer.Inner();
        inObj.in  = 23;

        Outer.fun("Raj");

    }
}
