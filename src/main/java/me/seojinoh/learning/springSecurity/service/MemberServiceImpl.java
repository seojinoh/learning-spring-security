package me.seojinoh.learning.springSecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.seojinoh.learning.springSecurity.common.DateUtil;
import me.seojinoh.learning.springSecurity.dao.MemberDao;
import me.seojinoh.learning.springSecurity.dto.MemberJoinRequest;
import me.seojinoh.learning.springSecurity.entity.Member;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired private MemberDao	memberDao;
	@Autowired private DateUtil		dateUtil;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Member member = memberDao.findByEmail(email);

		if(member == null) {
			throw new UsernameNotFoundException(email);
		}

		return member.toMemberDetails();
	}

	@Override
	@Transactional
	public Integer save(MemberJoinRequest memberJoinRequest) {
		Member member = memberJoinRequest.toEntityIncludingRegDt(dateUtil.getNowDt());

		return memberDao.save(member).getId();
	}

}
