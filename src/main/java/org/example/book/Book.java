package org.example.book;

public class Book {

    protected String title;
    private String author;
    private String synopsis;
    private String isbn;
    private float price;

    public Book (String title, String author, String synopsis, String isbn, float price){
        this.title = title;
        this.author = author;
        this.synopsis = synopsis;
        this.isbn= isbn;
        this.price= price;
    }

    public Book (String title){
        this.title = title;
    }
    public String overview(){
        return "-"+title+" por "+author+" : "+synopsis+" ";
    }

    public String getTitle(){
        return this.title;
    }
    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String newAuthor){
        this.author = newAuthor;
    }

    public String getSynopsis(){
        return this.synopsis;
    }
    public void setSynopsis(String newSynopsis){
        this.synopsis = newSynopsis;
    }

    public String getIsbn(){
        return this.isbn;
    }
    public void setIsbn(String newIsbn){
        this.isbn = newIsbn;
    }

    public float getPrice(){
        return this.price;
    }
    public void setPrice(float newPrice){
        this.price = newPrice;
    }
}