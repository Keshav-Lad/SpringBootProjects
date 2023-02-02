package modelV1.service;

import modelV1.Entity.RegisterUser;

public interface LoginUserService {
	
	public RegisterUser getUser(String email,String password);

}
