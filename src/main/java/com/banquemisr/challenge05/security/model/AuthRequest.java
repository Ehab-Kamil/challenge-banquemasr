package com.banquemisr.challenge05.security.model;

import lombok.Data;

/**
 * <p>
 * Title: AuthRequest.java
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
 * @date 02/01/2025
 */
@Data
public class AuthRequest {

	private String username;
	private String password;

}
