package com.ysuturin.springdoc.example20HIBER_part2;

import com.ysuturin.springdoc.Book;
import com.ysuturin.springdoc.BookDAO;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class BookDAOImpl extends HibernateDaoSupport implements BookDAO {
    @Override
    public List<Book> getAll() {
        return getHibernateTemplate().loadAll(Book.class);
    }

    @Override
    @Transactional
    public void insert(Book book) {
        getHibernateTemplate().save(book);
    }

    @Override
    @Transactional
    public void update(int id, String title) {
        Book book = getHibernateTemplate().getSessionFactory().openSession().get(Book.class, id);
        book.setTitle(title);
        getHibernateTemplate().update(book);
    }

    @Override
    @Transactional
    public void delete(Book book) {
        getHibernateTemplate().delete(book);
    }

    @Override
    public Book findByTitle(String title) {
        return (Book) getHibernateTemplate()
                .findByCriteria(DetachedCriteria.forClass(Book.class)
                    .add(Restrictions.ilike("title", title)))
                .get(0);
    }
}