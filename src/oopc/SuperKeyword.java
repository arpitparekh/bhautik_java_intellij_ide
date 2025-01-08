package oopc;

class A1{
    int a1;

    A1(int a1){
        this.a1 = a1;
    }

    void dance(){
        System.out.println("A1 is dancing");
    }

}
class B1 extends A1{
    int b1;

    B1(int a1,int b1) {
        super(a1);
        this.b1 = b1;
    }

    void display(){
        System.out.println(a1);
        System.out.println(b1);
    }

    void party(){
        super.dance();
    }
}
/// /////////////////////////////////////////

class H{
    int h;
}
class K extends H{
    int h;

    void assign(int a,int b){
        this.h = a;
        super.h = b;
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        // super only works with inheritance

        B1 b1 = new B1(10,20);
        b1.display();
        b1.party();
        b1.dance();

    }
}
