package me.seojinoh.learning.springSecurity.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import me.seojinoh.learning.springSecurity.entity.Member;

public interface MemberDao extends JpaRepository<Member, Integer> {

	Member findByEmail(String email);

}
