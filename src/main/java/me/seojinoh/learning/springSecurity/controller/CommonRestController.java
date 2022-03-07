package me.seojinoh.learning.springSecurity.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.seojinoh.learning.springSecurity.dto.MemberJoinRequest;
import me.seojinoh.learning.springSecurity.service.MemberService;

@RestController
@RequestMapping(value = "/api")
public class CommonRestController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired private MemberService memberService;

	@PostMapping("/signUp")
	public void signUpPost(HttpServletRequest request, HttpServletResponse response, MemberJoinRequest memberJoinRequest) throws IOException {
		memberService.save(memberJoinRequest);

		response.sendRedirect("/login");
	}

}
