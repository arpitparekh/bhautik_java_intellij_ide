package other;

public class WrapperClass {

    public static void main(String[] args) {

        // wrapper class
        // 8 primitive datatypes
        // byte
        // short
        // int
        // long
        // float
        // double
        // boolean
        // char

        // stack // primitive
        // heap // object

        // primitive datatype => wrapper class

        int a = 12;
        byte b = (byte)a;


        Integer a1 = 34;
        Byte b1 = a1.byteValue();
        String number = a1.toString();
        Integer a2 = 34;

        String myData = "656565";

        Integer a3 = Integer.parseInt(myData);
        System.out.println(a3);

        // boxing // unboxing
        int num = 45;
        Integer a4 = num;

        int num2 = a4;


    }
}
