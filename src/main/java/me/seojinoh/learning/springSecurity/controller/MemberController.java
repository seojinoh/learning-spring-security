package me.seojinoh.learning.springSecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import me.seojinoh.learning.springSecurity.dto.MemberJoinRequest;
import me.seojinoh.learning.springSecurity.service.MemberService;

@Controller
@RequestMapping(value = "/")
public class MemberController {

	@Autowired
	private MemberService memberService;

	@GetMapping({"/", "/home"})
	public String homeView() {
		return "pages/home";
	}

	@GetMapping("/login")
	public String loginView() {
		return "pages/login";
	}

	@GetMapping("/signUp")
	public String signUpView() {
		return "pages/signUp";
	}

	@PostMapping("/signUp")
	public String signUp(MemberJoinRequest memberJoinRequest) {
		memberService.save(memberJoinRequest);

		return "redirect:/login";
	}

	@PreAuthorize("hasRole('ROLE_USER')")
	@GetMapping("/user/userInfo")
	public String userInfoView() {
		return "pages/userInfo";
	}

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/admin")
	public String adminView() {
		return "pages/admin";
	}

	@GetMapping("/denied")
	public String deniedView() {
		return "pages/denied";
	}

}
