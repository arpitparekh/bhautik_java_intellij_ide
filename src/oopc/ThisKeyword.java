package oopc;

class Fun{
    String ride = "Jump Rope";
    int no_passengers;

    Fun(String ride,int no_passengers){
//        this();    // calling same class constrcutor
        this(ride);

        this.ride = ride;
        this.no_passengers = no_passengers;
    }

    Fun(){
        System.out.println("Default Constructor");
    }


    Fun(String ride){
        this();
        System.out.println("Passengers are having fun on : "+ride);
    }

    void display(){
        System.out.println("Ride : "+ride);
        System.out.println("No_passengers : "+no_passengers);
        this.dance();
    }

    void dance(){
        System.out.println("Dancing");
    }

    /// /////////////////////////////////////

    void functionOne(Fun f){
        f.display();
    }

    void functionTwo(){
        Fun f = new Fun("Jumping",50);
//        functionOne(f);
        functionOne(this);
    }

    Fun copy(){
      return this;
    }

}

public class ThisKeyword {
    public static void main(String[] args) {

        // this keyword
        // current class instance

        Fun f = new Fun("Roller Coster",30);
        f.display();
        f.functionTwo();
//        Fun f2 = f.copy();
//        Fun f3 = f;

    }
}
