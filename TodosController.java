package com.code365.services.todos.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todos")
public class TodosController {
	
	@GetMapping("/getTodos")
	public String getTodos() {
		return "All todos"; 
	}
	
	
	@PostMapping("/postTodos")
	public String postTodos() {
		return "Todos Created"; 
	}
	@PutMapping("/putTodos")
	public String putTodos() {
		
		return "Todos Update"; 
	}
	
	@DeleteMapping("/deleteTodos")
	public String deleteTodos() {
		
		return "Todos Deleted"; 
	}
	
	
	

}
