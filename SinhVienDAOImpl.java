package com.dts.studentManager.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.javaguides.springmvc.entity.SinhVienEntity;

@Repository
public class SinhVienDAOImpl implements SinhVienDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List < SinhVienEntity > getSinhViens() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery < SinhVienEntity > cq = cb.createQuery(SinhVienEntity.class);
        Root < SinhVienEntity > root = cq.from(SinhVienEntity.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public void deleteSinhVien(int id) {
        Session session = sessionFactory.getCurrentSession();
        SinhVienEntity book = session.byId(SinhVienEntity.class).load(id);
        session.delete(book);
    }

    @Override
    public void saveSinhVien(SinhVienEntity theCustomer) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(theCustomer);
    }

    @Override
    public SinhVienEntity getSinhVien(int theId) {
        Session currentSession = sessionFactory.getCurrentSession();
        SinhVienEntity theCustomer = currentSession.get(SinhVienEntity.class, theId);
        return theCustomer;
    }
}
