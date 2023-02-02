package modelV1.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import modelV1.Entity.RegisterUser;

public interface LoginUserRepo extends JpaRepository<RegisterUser,Long> {
	
	
	@Query(value="select r from RegisterUser r where r.email=:email and r.password=:password")
	public RegisterUser getUser(String email,String password);

}
