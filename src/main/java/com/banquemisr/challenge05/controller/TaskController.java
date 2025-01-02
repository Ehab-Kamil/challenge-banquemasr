package com.banquemisr.challenge05.controller;

import com.banquemisr.challenge05.dto.TaskDTO;
import com.banquemisr.challenge05.model.Task;
import com.banquemisr.challenge05.service.TaskService;
import com.banquemisr.challenge05.transformer.TaskTransformer;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 * Title: TaskController.java
 * </p>
 *
 * <p>
 * Description:
 * </p>
 *
 * <p>
 * Copyright: Copyright(c) Ehab Kamil, 2025
 * </p>
 *
 * @author <a href="mailto:ehabkamil2@gmail.com">Ehab Attia</a>
 * @version 1.0
 * @date 01/01/2025
 */
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

	@Autowired
	private TaskService taskService;

	@Autowired
	private TaskTransformer taskTransformer;

	@GetMapping
//	@PreAuthorize("hasRole('ADMIN') or @securityService.isOwner(authentication, #userId)")
	public ResponseEntity<List<TaskDTO>> getAllTasks() {
		return ResponseEntity.ok(taskService.getAllTasks());
	}

	@PostMapping
	public ResponseEntity<TaskDTO> createTask(@Valid @RequestBody TaskDTO taskDto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(taskService.saveTask(taskDto));
	}

	@GetMapping("/search")
	public ResponseEntity<List<TaskDTO>> searchTasks(@RequestParam(required = false) String title,
			@RequestParam(required = false) String status, @RequestParam(required = false) LocalDate dueDate) {
		return ResponseEntity.ok(taskService.searchTasks(title, status, dueDate));
	}
}

