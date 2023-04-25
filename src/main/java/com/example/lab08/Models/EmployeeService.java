package com.example.lab08.Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeService{
    @Autowired
    private EmployeeRepository repo;

    public List<Employee> listAll(){
        return repo.findAll();
    }
    public void save(Employee employee){
        repo.save(employee);
    }
    public Employee get(long id){
        return repo.findById(id).get();
    }
    public void delete(long id){
        repo.deleteById(id);
    }
}
