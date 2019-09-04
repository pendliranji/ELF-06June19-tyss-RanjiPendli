package com.taskmanagement.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanagement.dto.CreateTaskBean;
import com.taskmanagement.dto.UserBean;
import com.taskmanagement.repo.TaskRepository;
import com.taskmanagement.repo.UserRepository;

@RestController
public class SearchController {

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private TaskRepository taskRepo;

	@GetMapping(path = "/search", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public List<UserBean> search(@RequestParam("email") String email) {

		return userRepo.existsByEmail(email);

	}

	@GetMapping(path = "/byme", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public List<CreateTaskBean> taskAssignedByMe(@RequestParam("email") String email, HttpSession ses) {

		return taskRepo.assignedByMe(email);

	}

	@GetMapping(path = "/tome", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public List<CreateTaskBean> taskAssignedToMe(@RequestParam("email") String email) {

		return taskRepo.assignedToMe(email);

	}

}
