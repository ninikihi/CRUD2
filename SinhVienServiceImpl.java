package net.javaguides.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.javaguides.springmvc.dao.SinhVienDAO;
import net.javaguides.springmvc.entity.SinhVienEntity;

@Service
public class SinhVienServiceImpl implements SinhVienService {

    @Autowired
    private SinhVienDAO customerDAO;

    @Override
    @Transactional
    public List < SinhVienEntity > getCustomers() {
        return customerDAO.getCustomers();
    }

    @Override
    @Transactional
    public void saveCustomer(SinhVienEntity theCustomer) {
        customerDAO.saveCustomer(theCustomer);
    }

    @Override
    @Transactional
    public SinhVienEntity getCustomer(int theId) {
        return customerDAO.getCustomer(theId);
    }

    @Override
    @Transactional
    public void deleteCustomer(int theId) {
        customerDAO.deleteCustomer(theId);
    }
}
