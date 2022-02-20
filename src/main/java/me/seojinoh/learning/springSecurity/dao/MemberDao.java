package me.seojinoh.learning.springSecurity.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import me.seojinoh.learning.springSecurity.entity.Member;

public interface MemberDao extends JpaRepository<Member, Integer> {

	Optional<Member> findByEmail(String email);

}
