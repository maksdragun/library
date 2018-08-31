package ua.dragun.library.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import ua.dragun.library.entity.Book;

import java.util.Collection;

@Repository
public class BookSearchDao {

    @Autowired
    MongoTemplate mongoTemplate;

    public Collection searchBooks(String text) {
        return mongoTemplate.find(Query.query(new Criteria()
                .orOperator(Criteria.where("description").regex(text, "i"),
                        Criteria.where("author").regex(text, "i"),
                        Criteria.where("title").regex(text, "i"))
        ), Book.class);
    }
}
