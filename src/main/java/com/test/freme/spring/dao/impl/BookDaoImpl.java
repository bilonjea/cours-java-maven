/**
 * 
 */
package com.test.freme.spring.dao.impl;

import java.awt.print.Book;
import java.util.List;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import com.test.freme.spring.dao.BookDao;

/**
 * @author bilonjea
 *
 */
public class BookDaoImpl implements BookDao {
	
	private SimpleJdbcTemplate jdbcTemplate;

	@Override
	public void createBook(Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public void modifyBook(Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBook(Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public Book getBookbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBooks(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countBooks() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	public void setJdbcTemplate(SimpleJdbcTemplate jdbcTemplate) {
		 
		this.jdbcTemplate = jdbcTemplate;
		 
		}

}
