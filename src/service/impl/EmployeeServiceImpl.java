package service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.BaseDAO;
import model.Employee;
import service.EmployeeService;
@Service("employeeService")
public class EmployeeServiceImpl extends BaseServiceImpl<Employee> implements EmployeeService {
	@Resource(name="employeeDao")
	public void setDao(BaseDAO<Employee> dao) {
		super.setDao(dao);
	}
}
