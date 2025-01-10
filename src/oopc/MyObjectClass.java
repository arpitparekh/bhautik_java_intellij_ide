package oopc;

class Travel implements Cloneable{
    int a;
    int b;

    Travel(int a, int b){
        this.a = a;
        this.b = b;
    }

    Travel(Travel t){   // copy constructor
        this.a = t.a;
        this.b = t.b;
    }

    @Override
    public String toString() {   // object => string representation
        return a+" "+b;
    }

    @Override
    public boolean equals(Object obj) {

        // Object obj = t1;

        Travel t = (Travel) obj;

        if(this.a == t.a && this.b == t.b){
            return true;
        }else{
            return false;
        }

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class MyObjectClass {

    public static void main(String[] args) throws CloneNotSupportedException {
        Travel t = new Travel(12,13);
        System.out.println(t);
        Travel t1 = new Travel(12,13);
        System.out.println(t1);

        // object equality
        System.out.println(t==t1);   // location

        System.out.println(t.equals(t1));

//        System.out.println(t instanceof Travel);

        System.out.println(t.hashCode());
        System.out.println(t1.hashCode());

        Travel t3 = t;   // reference variable
        t3.a = 10;
        t3.b = 10;

        System.out.println(t3.hashCode());

        System.out.println(t);   // t => t3 (=)
        System.out.println(t3);

        Travel t4 = (Travel) t1.clone(); // t1 => t4 (clone)
        t4.a = 10;
        t4.b = 10;
        System.out.println(t4);
        System.out.println(t1);

        // clone can be also done with copy constructor

        Travel t5 = new Travel(t1);
        System.out.println(t5);

        System.out.println(t5.getClass());

    }
}
