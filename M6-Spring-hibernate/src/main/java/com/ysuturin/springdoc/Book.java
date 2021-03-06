package com.ysuturin.springdoc;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "BOOK")
public class Book {
    private int id;
    private String title;
    private LocalDate dateRelease;

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "TITLE")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "DATE_RELEASE")
    public LocalDate getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(LocalDate dateRelease) {
        this.dateRelease = dateRelease;
    }

    @Override
    public String toString() {
        return id + ": " + title + ", released " + dateRelease;
    }
}
