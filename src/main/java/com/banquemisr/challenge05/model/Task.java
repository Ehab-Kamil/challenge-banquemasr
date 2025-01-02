package com.banquemisr.challenge05.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * Title: Task.java
 * </p>
 *
 * <p>
 * Description:
 * </p>
 *
 * <p>
 * Copyright: Copyright(c) Ehab Kamil, 2024
 * </p>
 *
 * @author <a href="mailto:ehabkamil2@gmail.com">Ehab Attia</a>
 * @version 1.0
 * @date 31/12/2024
 */
@Entity
@Data
public class Task extends AbstractEntity {

	@NotBlank
	private String title;

	private String description;

	@Enumerated(EnumType.STRING)
	private TaskStatus status;

	@Min(1)
	@Max(5)
	private Integer priority;

	private LocalDate dueDate;

	@ManyToOne
	private User user;

}
