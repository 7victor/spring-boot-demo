package com.example.po;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/**
 * 加载properties文件内配置通过frefix属性指定前缀，通过locations指定properties文件的位置
 * @author victor
 *
 */
@Component
@ConfigurationProperties(prefix="book")
public class Book {
	private String author;
	private String name;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
