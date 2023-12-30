package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.MyService;

@RestController
public class MyController {

	@Autowired
	private MyService service;
	
	@PostMapping("/addBook")
	public ResponseEntity<String> addBook(@ModelAttribute Book book){
		System.out.println(book);
		String msg = service.addBook(book);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	
	
	
	
}
