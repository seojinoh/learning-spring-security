package me.seojinoh.learning.springSecurity.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import me.seojinoh.learning.springSecurity.dto.MemberJoinRequest;

public interface MemberService extends UserDetailsService {

	Integer save(MemberJoinRequest memberJoinRequest);

}
