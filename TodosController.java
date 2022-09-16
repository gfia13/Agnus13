package com.code365.services.todos.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actor")
public class TodosController {

	@GetMapping("/getActor")
	public String getActor() {
		return "All Actor";
	}

	@PostMapping("/postActor")
	public String postActor() {
		return "Actor Created";
	}

	@PutMapping("/putActor")
	public String putActor() {

		return "Actor Update";
	}

	@DeleteMapping("/deleteActor")
	public String deleteActor() {

		return "Actor Deleted";
	}

}
