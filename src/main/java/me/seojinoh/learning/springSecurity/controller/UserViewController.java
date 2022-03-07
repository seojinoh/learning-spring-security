package me.seojinoh.learning.springSecurity.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class UserViewController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/userInfo")
	public String userInfoView() {
		return "user/UserInfo";
	}

	@GetMapping("/event")
	public String eventView() {
		return "user/Event";
	}

}
