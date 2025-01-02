package com.banquemisr.challenge05.configuration;

/**
 * <p>
 * Title: ModelMapperConfig.java
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

import com.banquemisr.challenge05.dto.TaskDTO;
import com.banquemisr.challenge05.model.Task;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();

		// Example: Custom mapping if needed
		modelMapper.typeMap(Task.class, TaskDTO.class).addMappings(mapper -> mapper.map(src -> src.getUser().getId(), TaskDTO::setUserId));
		modelMapper.typeMap(TaskDTO.class, Task.class);

		return modelMapper;
	}
}

