package other;

public class StringBufferAndBuilder {

    public static void main(String[] args) {

        String data = "Hello";  // immutable

        // string immutable

        // null string // blank
//        String s1 = "";
//        String s2 = null;
//
//        System.out.println(s1.length());
//        System.out.println(s2.length());

        data.toLowerCase();
        System.out.println(data);

        data = "Hi";
        System.out.println(data);

        StringBuilder s3 = new StringBuilder("Hello from String Buffer"); // mutable
        System.out.println(s3);
        s3.append("In java");
        System.out.println(s3);

    }
}
