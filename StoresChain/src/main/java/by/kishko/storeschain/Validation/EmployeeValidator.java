package by.kishko.storeschain.Validation;

import by.kishko.storeschain.Model.Employee;
import by.kishko.storeschain.Services.EmployeeService;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class EmployeeValidator  implements Validator {
    private EmployeeService employeeService;
    @Override
    public boolean supports(Class<?> clazz) {
        return Employee.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Employee employee = (Employee) target;


    }
}
