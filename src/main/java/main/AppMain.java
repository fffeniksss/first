package main;

import dao.BooksEntity;
import org.hibernate.Session;
import util.CRUDimpl;
import util.SessionFactoryUtil;

public class AppMain {
    public static void main(String[] args) {
        CRUDimpl cruDimpl=new CRUDimpl();

        System.out.printf("creating");
        BooksEntity booksEntityCreating=new BooksEntity(2,"title book2","description book2","author book2",
                "isbn book2", (long) 1984,"n");
        BooksEntity booksEntityCreating3=new BooksEntity(3,"title book2","description book2","author book2",
                "isbn book2", (long) 1984,"n");
        BooksEntity booksEntityCreating4=new BooksEntity(4,"title book2","description book2","author book2",
                "isbn book2", (long) 1984,"n");
        cruDimpl.create(booksEntityCreating);
        /////////////////////////////////////////////////
       /* System.out.println("reading");
        cruDimpl.read((long)1);
        System.out.println(cruDimpl.fountById(1));
        //////////////////////////////
        System.out.println("updatind");
        cruDimpl.update(4,"title book4","isbn book4",1999);
        System.out.println(cruDimpl.fountById(4));
        System.out.println("delete");
        cruDimpl.delete(2);
        System.out.println("deleted");*/

    }
}
