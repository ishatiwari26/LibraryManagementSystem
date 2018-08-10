package com.yash.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.yash.controller.BooksFactory;
import com.yash.pojo.BooksBeans;
import com.yash.service.BooksInterface;

public class ActionBookImpl implements BooksInterface {
	List<BooksBeans> beanBooks = new ArrayList<BooksBeans>();
	BooksBeans beanBook = new BooksBeans();

	@Override
	public void displayBooks(BooksBeans beanBook) {
		List<BooksBeans> book1 = BooksFactory.addBooks();
		/*
		 * BooksBeans book = book1.stream().filter((p) -> p.getCatId() ==
		 * beanBook.getCatId()).findAny().orElse(null);
		 * System.out.println(book.getCatId() + " :: " + book.getAuthor() +
		 * " :: " + book.getTitle());
		 */

		book1.stream().filter((p) -> p.getCatId() == beanBook.getCatId()).forEach(System.out::println);
	}
}
