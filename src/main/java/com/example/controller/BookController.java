package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.po.Book;
/**
 * @RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用。
 * @author victor
 *
 */
@RestController
public class BookController {
	@Value("${book.author}")
	private String bookAuthor;
	@Value("${book.name}")
	private String bookName;
	@Autowired
	private Book book;
	@RequestMapping("book")
	public String book(){
		return "book name is " + bookName + " and book author is " + bookAuthor;
	}
	@RequestMapping("book2")
	public String book2(){
		return "book name is " + book.getName() + " and book author is " + book.getAuthor();
	}
}
