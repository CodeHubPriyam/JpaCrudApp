package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.entity.repository.MyRepository;

@Service
public class MyServiceImpl implements MyService{
	@Autowired
	MyRepository repo;
	@Override
	public String addBook(Book book) {
		repo.save(book);
		return "BOOK_ADDED";
	}
	
	@Override
	public String deleteBook(Integer id) {
		repo.deleteById(id);
		return "BOOK_DELETED";
	}
	@Override
	public List showBooks() {
		List<Book> list = repo.findAll();
		return list;
	}
	@Override
	public String UpdateBook(Book book) {
		Integer id = book.getBookID();
		 if(id==null)
			 return "SORRY NO SUCH BOOK IS THERE";
		 else {
			 repo.save(book);
			 return "BOOK SAVED SUCCESFULLY";
		 }
			 
	}
}
