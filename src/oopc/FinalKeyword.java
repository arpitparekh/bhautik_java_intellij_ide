package oopc;

final class MyClass{
    final int a;

    MyClass(int a){
        this.a = a;
    }
}

// you can not inherit final class into child
//class MyClass2 extends MyClass{
//
//}

// this // super // static // final

public class FinalKeyword {

    public static void main(String[] args) {

        MyClass mc = new MyClass(12);

    }
}
