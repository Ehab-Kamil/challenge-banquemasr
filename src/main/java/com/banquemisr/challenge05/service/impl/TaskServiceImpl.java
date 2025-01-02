package com.banquemisr.challenge05.service.impl;

import com.banquemisr.challenge05.dao.TaskRepository;
import com.banquemisr.challenge05.dto.TaskDTO;
import com.banquemisr.challenge05.service.TaskService;
import com.banquemisr.challenge05.transformer.TaskTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 * Title: TaskServiceImpl.java
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
@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskRepository taskRepository;

	@Autowired
	private TaskTransformer taskTransformer;

	public List<TaskDTO> getTasksByStatus(String status) {
		return taskTransformer.fromEntityToDTO(taskRepository.findByStatus(status));
	}

	public List<TaskDTO> getTasksByDueDate(LocalDate date) {
		return taskTransformer.fromEntityToDTO(taskRepository.findByDueDateBefore(date));
	}

	@Override
	public List<TaskDTO> getAllTasks() {
		return taskTransformer.fromEntityToDTO(taskRepository.findAll());
	}

	public List<TaskDTO> searchTasks(String keyword, String status, LocalDate dueDate) {
		return taskTransformer.fromEntityToDTO(taskRepository.searchTasks(keyword, status, dueDate));
	}

	public TaskDTO saveTask(TaskDTO task) {
		return taskTransformer.fromEntityToDTO(taskRepository.save(taskTransformer.fromDtoToEntity(task)));
	}

	public void deleteTask(Long taskId) {
		taskRepository.deleteById(taskId);
	}
}
