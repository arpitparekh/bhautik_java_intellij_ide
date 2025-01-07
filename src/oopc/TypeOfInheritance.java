package oopc;

/// /////////////////////////  multi level //////////////////
class A{
    int a;
}
class B extends A{
    int b;
}
class C extends B{
    int c;
}

/// ///////////////// hierarchical inheritance   // one parent multiple child

class X{
    int x;
}

class Y extends X{

}
class Z extends X{

}

/// ///////////////////////  multiple inheritance ///  not supported in java
/// to solve this we will use interface
///  multiple parent single child  # diamond problem
class P{

}
class Q{

}

class R extends P{

}



public class TypeOfInheritance {

    public static void main(String[] args) {

    }
}
