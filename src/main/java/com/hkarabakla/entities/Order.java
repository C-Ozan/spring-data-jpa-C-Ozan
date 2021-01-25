package com.hkarabakla.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


@Entity()
@Table(name = "Orders")
public class Order {

    @Id
    @GeneratedValue
    private int id;

    private Timestamp created_at;
    private int user_id;
    private double total;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private User user= new User();


    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL , mappedBy = "Order_Book")
    private List<Order_Book> order_books = new ArrayList<>();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Order_Book> getOrder_books() {
        return order_books;
    }

    public void setOrder_books(List<Order_Book> order_books) {
        this.order_books = order_books;
    }
}
