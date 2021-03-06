package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    @Test
    void testSaveManyToMany() {

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

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        // CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }


    @Test
    void testSearchEmployeeByName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee karlKovalsky = new Employee("Karl", "Kovalsky");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        //When
        employeeDao.save(johnSmith);
        int johnID = johnSmith.getId();
        employeeDao.save(karlKovalsky);
        int karlId = karlKovalsky.getId();
        employeeDao.save(stephanieClarckson);
        int carlId = stephanieClarckson.getId();
        employeeDao.save(lindaKovalsky);
        int lindaId = lindaKovalsky.getId();

        List<Employee> employeeByName = employeeDao.retrievByLastName("Kovalsky");


        //Then
        try {
            Assertions.assertEquals(2, employeeByName.size());
        } finally {
            employeeDao.deleteAll();
        }
    }

    @Test
    void test() {


        //Given
        Company softwareMachine = new Company("Software Machine");
        Company softwareMaesters = new Company("Software Maesters");
        Company greyMatter = new Company("Grey Matter");
        //When
        companyDao.save(softwareMachine);
        int softwareMachineid = softwareMachine.getId();
        companyDao.save(softwareMaesters);
        int softwareMaestersId = softwareMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterID = greyMatter.getId();


        List<Company> all = companyDao.searchCompanies("%Sof%");

        try {
            Assertions.assertEquals(2, all.size());
        } finally {
            companyDao.deleteById(softwareMachineid);
            companyDao.deleteById(softwareMaestersId);
            companyDao.deleteById(greyMatterID);
        }

    }


}





































