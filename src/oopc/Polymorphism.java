package oopc;

class Institute{
     public void display(float f){
        System.out.println("Institute");
    }

    // final method can not be overriden

    void display(int a){

    }

    void display(String name){

    }

    void display(int b,String name){

    }

    void display(String name,int b){

    }
}

class MyStudent extends Institute{

    // private < default<protected <public

    @Override
    public void display(float f){
        System.out.println("MyStudent");
        super.display(f);
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        // poly // many
        // morphism // form

        // method overloading
        // same class
        // no parameter must be different
        // type of parameter must be different
        // order of the parameter must be different

        // method overriding
        // inheritance
        // parameter same  // return type

        Institute i = new Institute();

        MyStudent ms = new MyStudent();
        ms.display(12.3f);



    }
}
