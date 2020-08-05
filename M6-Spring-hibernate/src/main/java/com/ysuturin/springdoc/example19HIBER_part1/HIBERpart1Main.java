package com.ysuturin.springdoc.example19HIBER_part1;

import com.ysuturin.springdoc.Book;
import com.ysuturin.springdoc.BookDAO;
import com.ysuturin.springdoc.Utils;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class HIBERpart1Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example19/application-context.xml");

        BookDAO bookDao =context.getBean(BookDAO.class);

        Book book = Utils.createBook();
        bookDao.insert(book);

        List<Book> allBooks = bookDao.getAll();

        String niceNewTitle = "New features in Java";
        if(allBooks.size() > 0){
            book = allBooks.get(0);

            System.out.println("updating book: " + book + "\n");
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
