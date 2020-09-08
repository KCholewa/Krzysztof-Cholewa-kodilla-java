package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTest {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private SearchFacade searchFacade;


    @Test
    public void testSearchByPartOfSurname() {

        //Given
        Employee janKowalski = new Employee("Jan","Kowalski");
        Employee janNowak = new Employee("Jan","Nowak");
        Employee jozefKowalski = new Employee("Józef","Kowalski");

        //When
        employeeDao.save(janKowalski);
        employeeDao.save(janNowak);
        employeeDao.save(jozefKowalski);
        List<Employee> employees = searchFacade.searchByPartOfSurname("owal");

        //Then
        Assert.assertEquals(2, employees.size());

        //Cleanup
        try {
            employeeDao.delete(janKowalski);
            employeeDao.delete(janNowak);
            employeeDao.delete(jozefKowalski);
        } catch (Exception e) {

        }
    }

    @Test
    public void testGetCompanyWherePartOfNameIs() {

        //Given
        Company microsoft = new Company("microsoft");
        Company microstar = new Company("microstar");
        Company lenovo = new Company("lenovo");

        //When
        companyDao.save(microsoft);
        companyDao.save(microstar);
        companyDao.save(lenovo);
        List<Company> companies = searchFacade.getCompanyWherePartOfNameIs("icro");

        //Then
        Assert.assertEquals(2, companies.size());

        //Cleanup
        try {
            companyDao.delete(microsoft);
            companyDao.delete(microstar);
            companyDao.delete(lenovo);
        } catch (Exception e) {

        }

    }
}
