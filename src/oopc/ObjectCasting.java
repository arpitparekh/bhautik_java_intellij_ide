package oopc;

class P1{

}

class C1 extends P1{

}

class Watch{
    int kata;

}

class Time extends Watch{
    String time;
}

public class ObjectCasting {

    public static void main(String[] args) {

        C1 c1 = new C1();

        P1 p1 = c1;  // parent to child casting

        C1 c2 = (C1) p1;

        Watch w = new Time();
        w.kata = 4;

        Time t = (Time)w;
        System.out.println(t.kata);
        System.out.println(t.time);

    }
}
