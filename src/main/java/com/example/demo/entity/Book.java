package com.example.demo.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="BOOK_DETAIL")
@Entity
public class Book {
	
	@Id
	private Integer bookID;
	private String bookName;
	private String bookAuthor;
	
	@CreationTimestamp
	@Column(name="CREATED_DATE",updatable = false)
	private LocalDate createdDate;
	
	@UpdateTimestamp
	@Column(name="UPDATED_DATE",insertable = false)
	private LocalDate updatedDate;

	public Integer getBookID() {
		return bookID;
	}

	public void setBookID(Integer bookID) {
		this.bookID = bookID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + "]";
	}

	
	
}
