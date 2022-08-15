package com.kodilla.hibernate.manytomany.da.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.facade.Facade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class FacadeTestSuite {
    @Autowired
    private Facade facade;

    @Test
    public void findCompanyByNameFragment() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        facade.company.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        facade.company.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        facade.company.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //When
        List<Company> expectedCompanyList = facade.findCompanyByNameFragment("ft");

        //Then
        Assertions.assertEquals(1, expectedCompanyList.size());

        //clean
        try {
            facade.company.deleteById(softwareMachineId);
            facade.company.deleteById(dataMaestersId);
            facade.company.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void findEmployeeByFragmentLastName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        facade.company.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        facade.company.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        facade.company.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //When
        List<Employee> expectedEmployeeList = facade.findEmployeeByFragmentLastName("sky");

        //Then
        Assertions.assertEquals(1, expectedEmployeeList.size());

        //clean
        try {
            facade.company.deleteById(softwareMachineId);
            facade.company.deleteById(dataMaestersId);
            facade.company.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }
}
