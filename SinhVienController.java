package com.dts.studentManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.javaguides.springmvc.entity.SinhVienEntity;
import net.javaguides.springmvc.service.SinhVienService;

@Controller
@RequestMapping("/sinhvien")
public class SinhVienController {

    @Autowired
    private SinhVienService sinhVienService;

    @GetMapping("/list")
    public String listCustomers(Model theModel) {
        List < SinhVienEntity > theCustomers = sinhVienService.getCustomers();
        theModel.addAttribute("customers", theCustomers);
        return "listSinhVien";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        SinhVienEntity theCustomer = new SinhVienEntity();
        theModel.addAttribute("customer", theCustomer);
        return "addSinhVien";
    }

    @PostMapping("/saveSinhVien")
    public String saveCustomer(@ModelAttribute("customer") SinhVienEntity theCustomer) {
    	sinhVienService.saveCustomer(theCustomer);
        return "redirect:/sinhvien/list";
    }

    @GetMapping("/updateSinhVien")
    public String showFormForUpdate(@RequestParam("customerId") int theId,
        Model theModel) {
        SinhVienEntity theCustomer = sinhVienService.getCustomer(theId);
        theModel.addAttribute("customer", theCustomer);
        return "updateSinhVien";
    }

    @GetMapping("/deleteSinhVien")
    public String deleteCustomer(@RequestParam("customerId") int theId) {
    	sinhVienService.deleteCustomer(theId);
        return "redirect:/sinhvien/list";
    }
}
