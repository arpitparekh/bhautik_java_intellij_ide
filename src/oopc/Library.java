package oopc;

abstract class LibraryItem{

    int a ;


    abstract void checkOut();

    abstract void displayInfo();
}

class Book extends LibraryItem{

    String title;
    String author;
    int isbn;

    Book(String title, String author, int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    void checkOut() {
        System.out.println("Item Checked Out");
    }

    @Override
    void displayInfo(){
        System.out.println(title + " " + author + " " + isbn);
        checkOut();
    }
}

class Dvd extends LibraryItem{

    String title;
    String direction;
    int duration;

    Dvd(String title, String direction, int duration){
        this.title = title;
        this.direction = direction;
        this.duration = duration;
    }

    @Override
    void checkOut() {
        System.out.println("Item Checked Out");
    }

    @Override
    void displayInfo() {
        System.out.println(title + " " + direction + " " + duration);
        checkOut();
    }
}

public class Library {

    int[] numbers = {1,2,3,4,5};


}
