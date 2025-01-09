package oopc;

 abstract class JumboClass{
    public int i =12;
    int j;

//    JumboClass(){
//        System.out.println("constructor called");
//    }

    JumboClass(int j){
        this.j = j;
    }

    void method(){
        System.out.println("method called");
    }

    abstract void method2();  // method without anybody
}

class SmallClass extends JumboClass{

    SmallClass(int j) {
        super(j);
    }

    @Override
    void method2() {
        System.out.println("method2 called");
    }
}

public class Abstraction {

    public static void main(String[] args) {

        // abstraction is to provide implementation to other class
        // abstract class
        // you can not create object of an abstract class
        // abstract must have to be inherited into another class

        // abstract method  // method without anybody
        // abstract method must have to be overridden

        SmallClass sc = new SmallClass(12);
        sc.method();
        sc.method2();

    }
}
