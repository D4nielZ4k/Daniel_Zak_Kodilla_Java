package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompanyDao extends CrudRepository<Company,Integer> {

}
