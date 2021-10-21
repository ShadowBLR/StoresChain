package by.kishko.storeschain.Services.Interfaces;

import by.kishko.storeschain.Model.Employee;

import java.util.Date;
import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();
    void deleteEmployeeByNameFirstAndNameLastAndDateOfBirth(String first,String last, Date date);
    void addEmployee(String first,String last, Date date);
}
