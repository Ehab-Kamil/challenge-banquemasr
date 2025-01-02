package com.banquemisr.challenge05.dao;

import com.banquemisr.challenge05.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * <p>
 * Title: UserRepository.java
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
public interface UserRepository extends JpaRepository<User, Long> {

	// Find a user by username
	Optional<User> findByUsername(String username);
}
