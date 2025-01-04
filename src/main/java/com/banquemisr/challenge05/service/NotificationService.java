package com.banquemisr.challenge05.service;

import com.banquemisr.challenge05.model.Task;

/**
 * <p>
 * Title: NotificationService.java
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
public interface NotificationService {

	void notifyUpcomingTasks(Task task);
}
