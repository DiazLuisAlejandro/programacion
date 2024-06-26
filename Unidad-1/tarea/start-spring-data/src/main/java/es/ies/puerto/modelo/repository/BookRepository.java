package es.ies.puerto.modelo.repository;


import es.ies.puerto.modelo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findÇByTitle(String title);

    @Query("SELECT b FROM Book b WHERE b.publishDate > :date")
    List<Book> findByPublishedDateAfter(@Param("date") LocalDate date);}
