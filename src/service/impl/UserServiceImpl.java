package service.impl;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.BaseDAO;
import model.User;
import service.UserService;
import util.ValidateUtil;
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User>implements UserService {
	@Resource(name="userDao")
	public void setDao(BaseDAO<User> dao) {
		super.setDao(dao);
	}

	/**
	 * 检查用户是否已经被注册
	 */
	public boolean isRegisted(String username) {
		String hql = "from User u where u.name = ?";
		List<User> user = this.findEntityByHQl(hql, username);
		return !(ValidateUtil.isEmpty(user));
	}

	public User validateLoginInfo(String name, String md5) {
		String hql = "from User u where u.name = ? and u.passWord = ?";
		List<User> user = this.findEntityByHQl(hql, name,md5);
		return ValidateUtil.isEmpty(user) ? null : user.get(0);
	}

	
	
}
