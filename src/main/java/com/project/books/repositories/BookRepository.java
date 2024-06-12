package com.project.books.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.books.domain.BookEntity;

//modified class to interface. a repository is the abstraction that we use to save and retrieve things from the database.
//make it extend JpaRepository generic i.e JpaRepository<BookEntity,String> this means that it deals with BookEntity which has a key of type String.

@Repository //we are telling spring that this is a repository. meaning that it's the thing that we can use to interact with our persistence layer. this annotation also puts this repository into the spring context, which is a magical place where you can put things into and pull it out whatever it's needed in the app. spring context was traditionally created by xml configuration, later moved to annotation based configuration
public interface BookRepository extends JpaRepository<BookEntity,String>{
    
}


//we now have a book entity(which we can use to save and retrive via jpa) and also a book repository (which we can use to c,r,u,d from/to the database)

//we are now done(created entity and then repository) with our persistence layer(lowest layer,putting stuff to and from the database). we now move on to the service layer(where our buisiness logic lives) and then move on to the presentation layer which is the crud endpoints in REST.