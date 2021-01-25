package com.hkarabakla.entities;

import javax.persistence.*;

@Entity
@Table(name = "Order_Book")
public class Order_Book {

    @Id
    private int id;


    private int order_id;
    private String book_isbn;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "book_isbn",referencedColumnName = "isbn")
    private Book book = new Book();

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Order order = new Order();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getBook_isbn() {
        return book_isbn;
    }

    public void setBook_isbn(String book_isbn) {
        this.book_isbn = book_isbn;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
