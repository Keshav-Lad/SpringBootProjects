package modelV1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelV1.Entity.RegisterUser;
import modelV1.repositery.LoginUserRepo;

@Service
public class LoginUserServiceImpl implements LoginUserService {

	
	@Autowired
	private LoginUserRepo Lpo;
	@Override
	public RegisterUser getUser(String email, String password) {
		 RegisterUser ru=Lpo.getUser(email, password);
		 System.out.println(ru);
		return ru;
	}
	
	
	
	

}
