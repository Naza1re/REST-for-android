package com.RESTforANDROID.RESTforAndroid.Model.emploee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeDAO {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void save(Employee employee){
        employeeRepository.save(employee);
    }
    public void delete(Employee employee){
        employeeRepository.delete(employee);
    }
    public List<Employee> getAllEmployee(){
        List<Employee> allEmployee = new ArrayList<>();
        allEmployee = (List<Employee>) employeeRepository.findAll();
        return allEmployee;
    }
}
