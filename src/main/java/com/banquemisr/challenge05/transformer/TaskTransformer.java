package com.banquemisr.challenge05.transformer;

import com.banquemisr.challenge05.dto.TaskDTO;
import com.banquemisr.challenge05.model.Task;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * Title: TaskTransformer.java
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
@Component
public class TaskTransformer implements AbstractTransformer<Task, TaskDTO> {

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public TaskDTO fromEntityToDTO(Task entity) {
		return modelMapper.map(entity, TaskDTO.class);
	}

	@Override
	public List<TaskDTO> fromEntityToDTO(List<Task> entities) {
		return entities.stream().map(this::fromEntityToDTO).toList();
	}

	@Override
	public Task fromDtoToEntity(TaskDTO dto) {
		return modelMapper.map(dto, Task.class);
	}

	@Override
	public List<Task> fromDtoToEntity(List<TaskDTO> dtos) {
		return dtos.stream().map(this::fromDtoToEntity).toList();
	}
}
