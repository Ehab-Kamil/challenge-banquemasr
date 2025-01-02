package com.banquemisr.challenge05.dao;

/**
 * <p>
 * Title: TaskRepository.java
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

import com.banquemisr.challenge05.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

	List<Task> findAll();

	// Find tasks by status
	List<Task> findByStatus(String status);

	// Find tasks with a due date before the specified date
	List<Task> findByDueDateBefore(LocalDate dueDate);

	// Find tasks assigned to a specific user by user ID
	List<Task> findByUserId(Long userId);

	// Find tasks containing a keyword in the title
	List<Task> findByTitleContainingIgnoreCase(String keyword);

	// Custom query to find tasks based on multiple criteria
	@Query("SELECT t FROM Task t WHERE " + "(LOWER(t.title) LIKE LOWER(CONCAT('%', :keyword, '%')) OR "
			+ "LOWER(t.description) LIKE LOWER(CONCAT('%', :keyword, '%'))) AND " + "(:status IS NULL OR t.status = :status) AND "
			+ "(:dueDate IS NULL OR t.dueDate = :dueDate)")
	List<Task> searchTasks(@Param("keyword") String keyword, @Param("status") String status, @Param("dueDate") LocalDate dueDate);
}
