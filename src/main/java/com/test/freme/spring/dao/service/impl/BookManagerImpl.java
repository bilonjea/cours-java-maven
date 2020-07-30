/**
 * 
 */
package com.test.freme.spring.dao.service.impl;

import java.awt.print.Book;
import java.util.List;

import com.test.freme.spring.dao.BookDao;
import com.test.freme.spring.dao.service.BookManager;

/**
 * @author bilonjea
 *
 */
public class BookManagerImpl implements BookManager{
	
	private BookDao dao;

	@Override
	public void createBook(Book book) {
		dao.createBook(book);
		
	}

	@Override
	public void modifyBook(Book book) {
		dao.modifyBook(book);
		
	}

	@Override
	public void deleteBook(Book book) {
		dao.deleteBook(book);
		
	}

	@Override
	public Book getBookbyId(int id) {
		
		return dao.getBookbyId(id);
	}

	@Override
	public List<Book> getAllBooks(int id) {
		
		return dao.getAllBooks(id);
	}

}
