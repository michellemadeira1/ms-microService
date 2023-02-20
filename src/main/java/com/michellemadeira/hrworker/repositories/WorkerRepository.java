package com.michellemadeira.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michellemadeira.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
