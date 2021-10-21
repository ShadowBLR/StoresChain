package by.kishko.storeschain.Repositories;

import by.kishko.storeschain.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface IEmployeeRepository extends JpaRepository<Employee, Long> {
    Employee getEmployeeByNameFirstAndNameLastAndDateOfBirth(String nameFirst,String nameLast, Date DateOfBirth);
    void addEmployeeByNameFirstAndNameLastAndDateOfBirth(String nameFirst,String nameLast, Date DateOfBirth);
}