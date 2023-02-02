package modelV1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import modelV1.Entity.RegisterUser;
import modelV1.service.LoginUserServiceImpl;

@Controller
public class HomeController {
	
	@Autowired
	private LoginUserServiceImpl Lu;
	
	@RequestMapping(value={"/home"})
	public String display() {
		return "Home.html";
	}
	@GetMapping(value="/getdata")
	public ModelAndView getData(@RequestParam String email,@RequestParam String password) {
		RegisterUser ru=Lu.getUser(email, password);
		if(ru==null) {
			return new ModelAndView("redirect:/home");
		}
		return new ModelAndView("redirect:/show");
	}
}
