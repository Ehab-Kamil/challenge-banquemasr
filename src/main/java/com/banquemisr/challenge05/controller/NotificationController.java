package com.banquemisr.challenge05.controller;

import com.banquemisr.challenge05.dto.TaskDTO;
import com.banquemisr.challenge05.model.Task;
import com.banquemisr.challenge05.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
 * @date 04/01/2025
 */
@RestController
@RequestMapping("/api/notify")
public class NotificationController {

	@Autowired
	private NotificationService notificationService;

	@GetMapping
	public ResponseEntity<?> notifyTest() {
		notificationService.notifyUpcomingTasks(new Task());
		return ResponseEntity.ok(new Object());
	}

}
