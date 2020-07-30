/**
 * 
 */
package com.test.freme.spring.dao.service;

import java.awt.print.Book;
import java.util.List;

/**
 * @author bilonjea
 *
 */
public interface BookManager {
	
	public void createBook(Book book);
	public void modifyBook(Book book);
	public void deleteBook(Book book);
	public Book getBookbyId(int id);
	public List<Book> getAllBooks(int id);

}
