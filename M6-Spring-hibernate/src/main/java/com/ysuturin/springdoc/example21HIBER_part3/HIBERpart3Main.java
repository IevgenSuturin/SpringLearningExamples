package com.ysuturin.springdoc.example21HIBER_part3;

import com.ysuturin.springdoc.Book;
import com.ysuturin.springdoc.Utils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class HIBERpart3Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example21/application-context.xml");

        Dao bookDao = context.getBean(Dao.class);
        Book book = Utils.createBook();
        bookDao.insert(book);

        List<Book> allBooks = bookDao.getAll();
        Utils.displayBooks(allBooks);

        String niceNewTitle = "New features in Java";

        if (allBooks.size() > 0)
        {
            book = allBooks.get(0);

            System.out.println("\nUpdating book: " + book + "\n");
            bookDao.update(book.getId(), niceNewTitle);
        }

        Utils.displayBooks(bookDao.getAll());

        System.out.println("\nLooking for a book by title...\n");
        System.out.println("\nResult: " + bookDao.findByTitle(niceNewTitle));

        System.out.println("\nRemoving book: " + book + "\n");
        bookDao.delete(book);

        Utils.displayBooks(bookDao.getAll());
     }
}
