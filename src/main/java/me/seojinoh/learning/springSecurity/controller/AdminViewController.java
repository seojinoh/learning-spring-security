package me.seojinoh.learning.springSecurity.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin")
public class AdminViewController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/adminInfo")
	public String adminInfoView() {
		return "admin/AdminInfo";
	}

	@GetMapping("/event")
	public String eventView() {
		return "admin/Event";
	}

}
