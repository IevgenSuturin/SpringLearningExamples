package com.ysuturin.springdoc.example21HIBER_part3;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public abstract class AbstractHibernateDao<T> extends HibernateDaoSupport implements Dao<T> {

    private Class<T> clazz;

    public void setClazz(final Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public List<T> getAll() {
        return getHibernateTemplate().loadAll(clazz);
    }

    @Override
    @Transactional
    public void insert(T book) {
        getHibernateTemplate().save(book);
    }

    @Override
    @Transactional
    public void delete(T book) {
        getHibernateTemplate().delete(book);
    }
}
