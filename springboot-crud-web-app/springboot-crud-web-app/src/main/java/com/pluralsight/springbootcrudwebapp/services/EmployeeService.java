package com.pluralsight.springbootcrudwebapp.services;
//import com.pluralsight.springbootcrudwebapp.payload.response.*;
import com.pluralsight.springbootcrudwebapp.dto.EmployeeDTO;
import com.pluralsight.springbootcrudwebapp.dto.LoginDTO;
import com.pluralsight.springbootcrudwebapp.dto.LoginMesage;
import com.pluralsight.springbootcrudwebapp.models.Employee;
import com.pluralsight.springbootcrudwebapp.models.EmployeeProjectReport;
import com.pluralsight.springbootcrudwebapp.models.Project;
import com.pluralsight.springbootcrudwebapp.repositories.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    void deleteEmployeeById(long id);

    List<Employee> getAllEmployeesUsingJPAQL();
    List<EmployeeProjectReport> getAllEmployeesNameTitleUsingJPAQL();
    Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
    String addEmployee(EmployeeDTO employeeDTO);
    LoginMesage loginEmployee(LoginDTO loginDTO);
}
