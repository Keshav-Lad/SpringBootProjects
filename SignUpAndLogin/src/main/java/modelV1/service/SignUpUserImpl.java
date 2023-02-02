package modelV1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelV1.Entity.RegisterUser;
import modelV1.repositery.SignUpRepo;

@Service
public class SignUpUserImpl implements SignupUserService {

	@Autowired
	private SignUpRepo Rpo;
	@Override
	public void addUser(RegisterUser registeruser) {
		Rpo.save(registeruser);		
		
	}

}
