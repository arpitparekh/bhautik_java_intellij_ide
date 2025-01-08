package oopc;



class VitoChild extends Vito{
    void accessSomething(){
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
    }
}

public class AccessModifers {

    public static void main(String[] args) {

        // encapsulation
        // access modifiers
        // default
        // public
        // private
        // protected

        // same file
        Vito v = new Vito();
        System.out.println(v.a);
//        System.out.println(v.b);
        System.out.println(v.c);
        System.out.println(v.d);

    }
}
