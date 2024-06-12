package com.project.books.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//does all getters setters, equals and hashcodes etc for instance variables
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity//allows us to put the book entity into a table and retrieve it
@Table(name="books")//title of table
public class BookEntity {
    
    @Id
    private String isbn;

    private String author;//instance variable

    private String title;

    

}

//In this file we have created a Book entity, which is used by JPA to save and retrieve from database (in this case using hibernate). This maps to the table name "books" and has isbn as its key. next we proceed to create booksRepository