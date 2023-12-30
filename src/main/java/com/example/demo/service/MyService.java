package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Book;

public interface MyService {

	public String addBook(Book book);
	public String UpdateBook(Book book);
	public List showBooks();
	public String deleteBook(Integer id);
	
}
