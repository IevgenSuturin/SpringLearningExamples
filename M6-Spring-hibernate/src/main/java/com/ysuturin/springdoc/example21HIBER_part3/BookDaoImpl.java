package com.ysuturin.springdoc.example21HIBER_part3;

import com.ysuturin.springdoc.Book;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

public class BookDaoImpl extends AbstractHibernateDao<Book> {

    public BookDaoImpl() {
        setClazz(Book.class);
    }


    @Override
    @Transactional
    public void update(int id, String title) {
        Book book = (Book) getHibernateTemplate().getSessionFactory().openSession().get(Book.class, id);
        book.setTitle(title);
        getHibernateTemplate().update(book);
    }

    @Override
    @Transactional
    public Book findByTitle(String title) {
        return (Book) getHibernateTemplate()
                .findByCriteria(DetachedCriteria.forClass(Book.class).add(Restrictions.ilike("title", title)))
                .get(0);
    }
}
