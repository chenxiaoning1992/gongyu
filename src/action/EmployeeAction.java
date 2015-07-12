package action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import model.Employee;
import model.Room;
import service.EmployeeService;
import service.RoomService;
import util.ValidateUtil;
@Controller
@Scope("prototype")
public class EmployeeAction extends BaseAction<Employee> implements RequestAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer roomNumber;
	@Resource
	EmployeeService employeeService;
	@Resource
	RoomService roomService;
	private Map<String, Object> request; 



	public Integer getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}


	public EmployeeService getEmployeeService() {
		return employeeService;
	}


	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public void validateDoAddEmployee(){
		String name = getModel().getName();
		String phone = getModel().getPhone();
		String department = getModel().getDepartment();
	
		if(ValidateUtil.isEmpty(name)){
			addFieldError("name", "名字不能为空哟~");
		}
		if(ValidateUtil.isEmpty(phone)){
			addFieldError("phone", "手机不能为空哟~");
		}
		if(ValidateUtil.isEmpty(department)){
			addFieldError("department", "单位不能为空哟~");
		}
	}
		
	
	public String toAddEmployeePage(){
		return "addEmployeePage";
	}
	public String toFindEmployeePage(){
		return "findEmployeePage";
	}
	
	public String doFindEmployee(){
		String hql = "from Employee u where u.id like '%"+model.getId()+"%' and u.name like '%"+model.getName()+"%' and u.phone like '%"+model.getPhone()+"%' and u.department like '%"+model.getDepartment()+"%'";
		if(roomNumber == null || roomNumber.equals("")){
			roomNumber = 9999999;
		}
		Room userRoom = roomService.getEntity(roomNumber);
		List<Employee> employees = employeeService.findEntityByHQl(hql);
		request.put("employees", employees);
		System.out.println(employees.size());
		return "employeeListPage";
	}
	public String doAddEmployee(){
		model.setCheckinTime(new Date());
		Room room = roomService.getEntity(roomNumber);
		model.setId(222);
		model.setRoom(room);
		employeeService.saveEntity(model);
		return SUCCESS;
	}

	public void setRequest(Map<String, Object> arg0) {
		this.request = arg0;
	}
	
}
