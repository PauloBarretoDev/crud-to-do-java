package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    @GetMapping(value="/tasks")
        public List<Task> listar(){
            Task task = new Task(1,"Fazer a atividade",false);
            return Arrays.asList(task);
        }
}
