package com.hkarabakla.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity()
@Table(name = "Authors")
public class Author {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "Author",cascade = CascadeType.ALL)
    private List<Author_Book> authBooks = new ArrayList<>();


    public List<Author_Book> getAuthBooks() {
        return authBooks;
    }

    public void setAuthBooks(List<Author_Book> authBooks) {
        this.authBooks = authBooks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
