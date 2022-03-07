package me.seojinoh.learning.springSecurity.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonViewController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping({"/"})
	public String rootView() {
		return "redirect:/home";
	}

	@GetMapping({"/home"})
	public String homeView() {
		return "Home";
	}

	@GetMapping("/login")
	public String loginView() {
		return "Login";
	}

	@GetMapping("/signUp")
	public String signUpView() {
		return "SignUp";
	}

	@GetMapping("/accessDenied")
	public String accessDeniedView() {
		return "AccessDenied";
	}

}
