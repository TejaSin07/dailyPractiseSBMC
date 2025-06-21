 package in.tejas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	//here also one exception is  present but we are not handling here we global exception handling
	@GetMapping("/user")
	public String getUser(Model model) {
	
		model.addAttribute("msg", "User Email : ashok@gmail.com");
		
		String s = null;
		s.length(); //NPE
		
		return "index";
	}

}
