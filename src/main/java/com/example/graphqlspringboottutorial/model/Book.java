package com.example.graphqlspringboottutorial.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Book {
    @Id
    private String isn;
    private String title;
    private String publisher;
    private String[] authors;
    private Date publishedDate;
}
