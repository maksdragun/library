package ua.dragun.library.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.dragun.library.entity.Book;

@Repository
public interface BookDao extends CrudRepository<Book, String> {
}
