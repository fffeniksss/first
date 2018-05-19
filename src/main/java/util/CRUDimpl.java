package util;

import dao.BooksEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CRUDimpl implements CRUD {
    public BooksEntity fountById(long id){
        return SessionFactoryUtil.getSessionFactory().openSession().get(BooksEntity.class,id);
    }
    public void update(int id){
        read(id);
    }
    public void update(int id, String title,String isbn, int printYear){
        BooksEntity booksEntity=fountById(id);
        booksEntity.setBookTitle(title);
        booksEntity.setBookIsbn(isbn);
        booksEntity.setBookPrintyear((long) printYear);
        booksEntity.setBookReadalready("y");
        update(booksEntity);
    }

    public void create(BooksEntity booksEntity) {
        Session session=SessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        session.save(booksEntity);
        transaction.commit();
        session.close();
    }

    public void read(long id) {
        BooksEntity booksEntity=fountById(id);
        booksEntity.setBookReadalready("y");
        update(booksEntity);
    }

    public void update(BooksEntity booksEntity) {
        Session session=SessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        session.update(booksEntity);
        transaction.commit();
        session.close();
    }

    public void delete(long id) {
        Session session=SessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        session.delete(fountById(id));
        transaction.commit();
        session.close();
    }
}
