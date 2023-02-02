package modelV1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.validation.Valid;
import modelV1.Entity.RegisterUser;
import modelV1.service.SignUpUserImpl;

@Controller
public class SignupController {
	
	
	@Autowired
	private SignUpUserImpl rr;
	@RequestMapping("/signup")
	public String displaySignup(Model model) {
		
		model.addAttribute("RegisterUser",new RegisterUser());
		return "Register.html";
	}
	@PostMapping(value="/saveUser")
	public String AddUser(@Valid @ModelAttribute("RegisterUser")RegisterUser ru,Errors errors) {
		if(errors.hasErrors()) {
			System.out.println(errors.toString());
			return "Register.html";
		}
		else {
			rr.addUser(ru);
			return "redirect:/signup";
		}
		
	}

}
