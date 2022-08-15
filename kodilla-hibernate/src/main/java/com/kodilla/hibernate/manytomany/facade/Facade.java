package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {
    public CompanyDao company;
    private EmployeeDao employee;

    @Autowired
    public Facade(CompanyDao company, EmployeeDao employee) {
        this.company = company;
        this.employee = employee;
    }

    public List<Company> findCompanyByNameFragment(String nameFragment) {
        return company.findByName("%" + nameFragment + "%");
    }
    public List<Employee> findEmployeeByFragmentLastName(String lastNameFragment){
        return employee.findByLastName("%" + lastNameFragment +"%");
    }

}
