package com.devsuperior.hrworker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.hrworker.entities.Worker;
import com.devsuperior.hrworker.repositories.WorkerRepository;

// para funcionar como um recurso web que disponibiliza os endpoints
@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

    // endpoint para retornar todos os trabalhadores do banco de dados

    // injeção de dependencia usando o framework
    @Autowired
    // dependencia do objeto que acessa o banco de dados
    private WorkerRepository repository;

    // objeto que encapsula uma resposta https
    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        // método que retorna a resposta em uma lista
        List<Worker> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) {
        Worker obj = repository.findById(id).get();
        return ResponseEntity.ok(obj);
    }

}
