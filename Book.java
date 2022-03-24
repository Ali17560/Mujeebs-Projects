package edu.monmouth.hw3;

public class Book<BookTypes> {
    private int numberOfPages;
    private double price;
    private String title;
    private BookTypes bookType;

    public Book(int numberOfPages, double price, String title, BookTypes bookType) {
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.title = title;
        this.bookType = bookType;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BookTypes getBookType() {
        return bookType;
    }

    public void setBookType(BookTypes bookType) {
        this.bookType = bookType;
    }

    @Override
    public String toString() {
        return " The Book is " +  " the numberOfPages=" + numberOfPages + ", the price is=" + price + ",  the title is  ='" + title + "the bookType is =" + bookType + '}';
    }
}
