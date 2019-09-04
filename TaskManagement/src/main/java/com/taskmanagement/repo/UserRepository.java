package com.taskmanagement.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.taskmanagement.dto.UserBean;

public interface UserRepository extends JpaRepository<UserBean, Integer> {

	Optional<UserBean> findByEmail(String email);

	@Query("select u from UserBean u where u.email like %:email% ")
	List<UserBean> existsByEmail(String email);

	
	
}
