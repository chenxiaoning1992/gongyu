package action;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import model.User;
import service.UserService;
import util.DataUtil;
import util.ValidateUtil;
@Controller
@Scope("prototype")
public class UserAction extends BaseAction<User> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private String confirmPassword;
	
	@Resource
	private UserService userService;
	
	
	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public void validate(){
		//非空校验
		String name = getModel().getName();
		String password = getModel().getPassWord();
		
		if(ValidateUtil.isEmpty(name)){
			addFieldError("name", "名字不能为空哟~");
		}
		if(ValidateUtil.isEmpty(password)){
			addFieldError("password", "密码不能为空哟~");
			
		}
		//如果产生错误就不继续进行下面的校验了
		if(hasErrors()){
			return;
		}
		
		//判断用户名是否已经被注册
		
		if(userService.isRegisted(name)){
			addFieldError("name", "用户名已经被注册了哟~");
		}
		
		//验证密码是否一致
		if(!password.equals(confirmPassword)){
			addFieldError("password", "密码不一致哟~");
			return;
		}
	}
	@SkipValidation
	public String toAddUserPage(){
		return "addUserPage";
	}
	public String doAddUser(){
		model.setPassWord(DataUtil.md5(model.getPassWord()));
		userService.saveEntity(model);
		return SUCCESS;
	}
}
