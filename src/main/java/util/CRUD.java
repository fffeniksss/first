package util;

import dao.BooksEntity;

public interface CRUD {
    void create(BooksEntity booksEntity);
    void read(long id);
    void update(BooksEntity booksEntity);
    void delete(long id);

}
