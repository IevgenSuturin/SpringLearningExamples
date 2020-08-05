package com.ysuturin.springdoc.example19HIBER_part1;

import com.ysuturin.springdoc.Book;
import com.ysuturin.springdoc.BookDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO {
    private SessionFactory sessionFactory;
    private Session session;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
        session =this.sessionFactory.openSession();
    }

    @Override
    public List<Book> getAll() {
        return (List<Book>) session
                .createQuery("from Book")
                .list();
    }

    @Override
    public void insert(Book book) {
        Transaction tx = session.beginTransaction();

        session.save(book);

        tx.commit();
    }

    @Override
    public void update(int id, String title) {
        Transaction tx = session.beginTransaction();

        Book book = (Book)session.get(Book.class, id);
        book.setTitle(title);
        session.update(book);

        tx.commit();
    }

    @Override
    public void delete(Book book) {
        Transaction tx = session.beginTransaction();

        session.delete(book);

        tx.commit();
    }

    @Override
    public Book findByTitle(String title) {
        return (Book) session
                .createQuery("from Book where title=?0")
                .setParameter(0, title)
                .uniqueResult();
    }
}
