package com.codesoom.assignment.task.repository;

import com.codesoom.assignment.task.domain.Task;
import java.util.List;
import java.util.Optional;

public interface TaskRepository {

  Task save(Task task);

  Optional<Task> findById(Long id);

  List<Task> findAll();

  void deleteById(Long id);

  Task updateTitle(Long id, String title);
}
