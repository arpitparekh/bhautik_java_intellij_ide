package other;

import oopc.Vito;

class OtherChild extends Vito{
    void something(){
//        System.out.println(a);
//        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class OtherClass {
    public static void main(String[] args) {

        Vito v = new Vito();
        // private
        // default
        // protected
        OtherChild oc = new OtherChild();
//        System.out.println(oc.d);  //

    }
}
