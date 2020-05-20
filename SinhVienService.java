package com.dts.studentManager.service;

import java.util.List;

import net.javaguides.springmvc.entity.SinhVienEntity;

public interface SinhVienService {

    public List < SinhVienEntity > getSinhViens();

    public void saveSinhVien(SinhVienEntity theCustomer);

    public SinhVienEntity getSinhVien(int theId);

    public void deleteSinhVien(int theId);

}
