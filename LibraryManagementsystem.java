package com.yash.controller;

import java.util.Scanner;

import com.yash.pojo.BooksBeans;
import com.yash.service.BooksInterface;

public class LibraryManagementsystem {

	public static void main(String[] args) {

		System.out.println("Enter Book Category Id To Search :: ");
		Scanner scanNo = new Scanner(System.in);
		int catId = scanNo.nextInt();
		BooksBeans bookBeans = new BooksBeans();
		bookBeans.setCatId(catId);

		BooksInterface book = BooksFactory.getBooks(bookBeans.getCatId());
		try {
			book.displayBooks(bookBeans);
		} catch (Exception e) {
			System.out.println("The category Is not in stock.");
		}

	}

}
