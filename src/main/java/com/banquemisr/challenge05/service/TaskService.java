package com.banquemisr.challenge05.service;

import com.banquemisr.challenge05.dto.TaskDTO;

import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 * Title: TaskService.java
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
public interface TaskService {

	public List<TaskDTO> getTasksByStatus(String status);

	public List<TaskDTO> getTasksByDueDate(LocalDate date);

	public List<TaskDTO> getAllTasks();

	public List<TaskDTO> searchTasks(String keyword, String status, LocalDate dueDate);

	public TaskDTO saveTask(TaskDTO task);

	public void deleteTask(Long taskId);

}
