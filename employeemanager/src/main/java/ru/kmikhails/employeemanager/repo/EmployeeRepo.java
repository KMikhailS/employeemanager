package ru.kmikhails.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kmikhails.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
