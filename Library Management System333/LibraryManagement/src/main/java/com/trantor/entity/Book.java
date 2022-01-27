package com.trantor.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Book_Table")
public class Book {

	@Id
	private Integer id;
	private String author;
	private String language;
	private Integer pages;
	private String title;
	private Double price;
	private Integer year;
}
