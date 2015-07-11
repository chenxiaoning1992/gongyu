package service;

import model.User;

public interface UserService extends BaseService<User> {
	public boolean isRegisted(String username);
	public User validateLoginInfo(String name,String md5);
}
