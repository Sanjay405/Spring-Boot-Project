package com.trantor.repository;

import org.springframework.data.repository.CrudRepository;

import com.trantor.entity.Book;

public interface BookRepo extends CrudRepository<Book, Integer> {

}
