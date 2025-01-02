package com.banquemisr.challenge05.dto;

import lombok.Data;

import java.time.LocalDate;

/**
 * <p>
 * Title: TaskDto.java
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
@Data
public class TaskDTO extends AbstractDTO {

	private Long id;
	private String title;
	private String description;
	private String status;
	private Integer priority;
	private LocalDate dueDate;
	private Long userId; // For associating the task with a user
}
