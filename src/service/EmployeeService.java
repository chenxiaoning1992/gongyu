package service;

import model.Employee;

public interface EmployeeService extends BaseService<Employee> {
	public void deleteById(Integer id);
}
