package com.taskmanagement.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.taskmanagement.dto.CreateTaskBean;

public interface TaskRepository extends JpaRepository<CreateTaskBean, Integer> {

	/*
	 * @Query("Select e " + "from CreateTaskBean t " +
	 * "where t.priority LIKE '%:name'") CreateTaskBean get(String name);
	 */
	@Query("from CreateTaskBean where assignedTo=:assign")
	List<CreateTaskBean> assignedToMe(String assign);

	@Query("from CreateTaskBean where userBean.email=:email")
	List<CreateTaskBean> assignedByMe(String email);
	
}
