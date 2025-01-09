package oopc;

interface MyInterface{

    //  public, static, and final.
    int a = 0;
    
    // collection of abstract method
    void method1();
    void method2();
    void method3();
}

interface MyInterface2{
    void method4();
    void method5();
}


class MyClassNew implements MyInterface,MyInterface2{

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }


    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }
}

public class InterfaceInJava {

    public static void main(String[] args) {



    }
}
