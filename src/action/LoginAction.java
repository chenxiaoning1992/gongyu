package action;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import model.User;
import service.UserService;
import util.DataUtil;
@Controller
@Scope("prototype")
public class LoginAction extends BaseAction<User> implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Resource
	private UserService userService;
	private Map<String, Object> sessionMap;
	/**
	 * 校验登陆信息
	 */
	public void validateDoLogin(){
		User user = userService.validateLoginInfo(model.getName(), DataUtil.md5(model.getPassWord()));
		if(user == null){
			addActionError("账号或密码错误!!!!");
		}else{
			sessionMap.put("user",user);
		}
	}
	public String toLoginAction(){
		return "loginPage";
	}
	public String doLogin(){
		return SUCCESS;
	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		this.sessionMap = arg0;
	}
}
