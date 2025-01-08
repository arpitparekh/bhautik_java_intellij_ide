package oopc;

class Goa{

    static{
        System.out.println("This is static block");
    }

    Goa(){
        System.out.println("My Constrcutor");
    }

    // class variable
    static String state;
    String party_location;



}

public class StaticKeyword {

    public static void main(String[] args) {

//        Goa g1 = new Goa();
//        Goa.state ="Goa";
//        Goa g2 = new Goa();
//        System.out.println(g2.state);
//        Goa g3 = new Goa();
//        System.out.println(g3.state);
//        g3.state = "Maharastra";
//
//        Goa g4 = new Goa();
//        System.out.println(g4.state);

        Goa g6 = new Goa();


    }
}
