package br.com.home.workrecorder.repository;

import br.com.home.workrecorder.models.Work;
import org.springframework.data.repository.CrudRepository;

public interface WorkRepository extends CrudRepository<Work, Long> {
}
