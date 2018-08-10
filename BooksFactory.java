package com.yash.controller;

import java.util.ArrayList;
import java.util.List;

import com.yash.pojo.BooksBeans;
import com.yash.service.BooksInterface;
import com.yash.serviceImpl.ActionBookImpl;
import com.yash.serviceImpl.RomanticBookImpl;
import com.yash.serviceImpl.ThrillerBookImpl;

public class BooksFactory {
	static List<BooksBeans> booksBeans = new ArrayList<BooksBeans>();

	public static List<BooksBeans> addBooks() {
		BooksBeans beanBook1 = new BooksBeans(1, "The Odyssey", "Homer");
		BooksBeans beanBook2 = new BooksBeans(2, "Gulliver's Travels", "Jonathan Swift");
		BooksBeans beanBook3 = new BooksBeans(3, "Moby-Dick", "Herman Melville");
		BooksBeans beanBook4 = new BooksBeans(2, "Treasure Island", "Robert Louis Stevenson");
		BooksBeans beanBook5 = new BooksBeans(1, "The Adventures of Huckleberry Finn", "Mark Twain");
		BooksBeans beanBook6 = new BooksBeans(3, "The Call of the Wild", "Jack London");
		booksBeans.add(beanBook1);
		booksBeans.add(beanBook2);
		booksBeans.add(beanBook3);
		booksBeans.add(beanBook4);
		booksBeans.add(beanBook5);
		booksBeans.add(beanBook6);
		return booksBeans;
	}

	public static BooksInterface getBooks(int catId) {
		BooksBeans beanBooks = new BooksBeans();
		beanBooks.setCatId(catId);
		if (beanBooks.getCatId() == 1)
			return new ActionBookImpl();
		else if (beanBooks.getCatId() == 2)
			return new ThrillerBookImpl();
		else if (beanBooks.getCatId() == 3)
			return new RomanticBookImpl();

		return null;
	}
}
