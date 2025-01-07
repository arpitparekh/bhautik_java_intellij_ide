package oopc;

class Student{

    String name;
    int age;

    Student(String n,int a){    // parameterized constructor
        System.out.println("constructor called");
        name = n;
        age = a;
    }

    void display(){

        System.out.println(name);
        System.out.println(age);

    }

}


public class ConstructorInJava {

    public static void main(String[] args) {

        Student s = new Student("Sumit",27);
        s.display();

    }

}
