package es.uah.matcomp.mp.e1.ejerciciosclases.EJ2;

public class Book {
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty=0;
    public Book(String isbn, String name, Author author, double price){
        this.isbn=isbn;
        this.name=name;
        this.author=author;
        this.price=price;
    }
    public Book(String isbn, String name, Author author, double price, int qty){
        this.isbn=isbn;
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }
    public String getIsbn(){
        return this.isbn;
    }
    public String getName(){
        return this.name;
    }
    public Author getAuthor(){
        return this.author;
    }
    public double

}
