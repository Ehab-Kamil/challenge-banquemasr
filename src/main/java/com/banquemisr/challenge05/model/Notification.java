package com.banquemisr.challenge05.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.time.LocalDateTime;

/**
 * <p>
 * Title: Notification.java
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
@Entity
public class Notification extends AbstractEntity {

	@ManyToOne
	private Task task;

	@ManyToOne
	private User user;

	private String message;

}
