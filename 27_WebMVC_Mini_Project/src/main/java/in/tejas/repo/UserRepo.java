package in.tejas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.tejas.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
	public User findByEmailAndPwd(String email, String pwd);

}
