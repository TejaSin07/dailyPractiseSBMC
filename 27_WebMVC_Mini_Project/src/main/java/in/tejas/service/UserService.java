package in.tejas.service;

import in.tejas.entity.User;

public interface UserService {
	
	public boolean saveUser(User user);
	
	public User getUser(String email, String pwd);

}
