package br.com.home.workrecorder.repository;

import br.com.home.workrecorder.models.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {
    Client findByName(String name);
}
