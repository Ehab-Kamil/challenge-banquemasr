package com.banquemisr.challenge05.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * <p>
 * Title: User.java
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
@Entity(name = "users")
@Data
public class User extends AbstractEntity {

	@NotBlank
	private String username;

	@NotBlank
	private String password;

	@NotBlank
	private String email;

	@Enumerated(EnumType.STRING)
	private UserRole role;
}

