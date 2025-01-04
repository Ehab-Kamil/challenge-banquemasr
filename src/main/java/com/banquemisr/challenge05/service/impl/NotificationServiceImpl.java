package com.banquemisr.challenge05.service.impl;

import com.banquemisr.challenge05.model.Task;
import com.banquemisr.challenge05.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * <p>
 * Title: NotificationServiceImpl.java
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
@Service
public class NotificationServiceImpl implements NotificationService {

	@Autowired
	private JavaMailSender mailSender;

	@Override
	public void notifyUpcomingTasks(Task task) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("ehabkamil2@gmail.com	");
		message.setSubject("Task Notification");
		message.setText("Your task '");
		mailSender.send(message);
	}
}
