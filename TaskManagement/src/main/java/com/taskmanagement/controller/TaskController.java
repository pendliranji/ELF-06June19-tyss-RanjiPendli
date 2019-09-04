package com.taskmanagement.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanagement.dto.CreateTaskBean;
import com.taskmanagement.repo.TaskRepository;
import com.taskmanagement.repo.UserRepository;
import com.taskmanagement.response.Response;


@RestController
public class TaskController {

	@Autowired
	TaskRepository taskRepository;
	@Autowired
	UserRepository userRepository;

	@GetMapping(path = "/getTask", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Response getTask(@RequestParam("id") int id, HttpServletRequest req) {

		Response response = new Response();
		if (taskRepository.existsById(id)) {
			CreateTaskBean bean = taskRepository.findById(id).get();
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Task data found successfully");
			response.setTaskBean(Arrays.asList(bean));

			return response;
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Task data not found");

			return response;
		} // End of getTask()
	}

	@PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response createTask(@RequestBody CreateTaskBean task) {
		Response response = new Response();
		if (userRepository.existsById(task.getUserBean().getEmpId())) {

			taskRepository.save(task);
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Task added successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("user id does not exist ");
		}
		return response;

	}// End of createTask()

}
