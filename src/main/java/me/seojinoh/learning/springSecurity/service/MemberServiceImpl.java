package me.seojinoh.learning.springSecurity.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.seojinoh.learning.springSecurity.dao.MemberDao;
import me.seojinoh.learning.springSecurity.dto.MemberJoinRequest;
import me.seojinoh.learning.springSecurity.entity.Member;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDao memberDao;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<Member> memberWrapper = memberDao.findByEmail(email);
		Member member = memberWrapper.orElse(null);

		List<GrantedAuthority> authorities = new ArrayList<>();

		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));

		return new User(member.getEmail(), member.getPassword(), authorities);
	}

	@Override
	@Transactional
	public Integer save(MemberJoinRequest memberJoinRequest) {
		Member member = memberJoinRequest.toEntity();

		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String password = passwordEncoder.encode(member.getPassword());

		Member saveMember = new Member.Builder(member.getEmail(), password, member.getUsername(), member.getPhoneNumber())
				.build();

		return memberDao.save(saveMember).getId();
	}

}
