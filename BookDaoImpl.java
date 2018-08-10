package com.yash.daoImpl;

import com.yash.dao.BooksDaoInterface;
import com.yash.pojo.BooksBeans;
import com.yash.serviceImpl.ActionBookImpl;
import com.yash.serviceImpl.RomanticBookImpl;
import com.yash.serviceImpl.ThrillerBookImpl;

public class BookDaoImpl implements BooksDaoInterface {

	ActionBookImpl actionBook = new ActionBookImpl();
	ThrillerBookImpl thrillerBook = new ThrillerBookImpl();
	RomanticBookImpl romanticBook = new RomanticBookImpl();

	@Override
	public void displayBooks(BooksBeans beanBook) {
		actionBook.displayBooks(beanBook);
		thrillerBook.displayBooks(beanBook);
		romanticBook.displayBooks(beanBook);

	}

}
