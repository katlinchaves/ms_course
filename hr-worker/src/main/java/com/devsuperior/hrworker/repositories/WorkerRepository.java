package com.devsuperior.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.hrworker.entities.Worker;

// métodos para realizar o acesso a dados 
public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
