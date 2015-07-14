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
	
	public void deleteById(Integer id){
		String hql = "delete from Employee e where e.id = ?";
		System.out.println(id);
		this.batchEntityByHQL(hql, id);
	}
}
