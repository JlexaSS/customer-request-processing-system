package org.example.ProcessingSystem.repository;

import org.example.ProcessingSystem.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
