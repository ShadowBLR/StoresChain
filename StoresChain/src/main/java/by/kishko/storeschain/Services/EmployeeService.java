package by.kishko.storeschain.Services;

import by.kishko.storeschain.Model.Employee;
import by.kishko.storeschain.Repositories.IEmployeeRepository;
import by.kishko.storeschain.Services.Interfaces.IEmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class EmployeeService implements IEmployeeService {
    private final IEmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(IEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        log.info(EmployeeService.class+":findAll");
        return employeeRepository.findAll();
    }

    @Override
    public void deleteEmployeeByNameFirstAndNameLastAndDateOfBirth(String first, String last, Date date) {
        log.info(EmployeeService.class+":deleteEmployeeByNameFirstAndNameLastAndDateOfBirth");
        var employee = employeeRepository.getEmployeeByNameFirstAndNameLastAndDateOfBirth(first,last,date);
        employeeRepository.delete(employee);
    }

    @Override
    public void addEmployee(String first, String last, Date date) {
        log.info(EmployeeService.class+":addEmployee");
        employeeRepository.addEmployeeByNameFirstAndNameLastAndDateOfBirth(first,last,date);
    }
}
