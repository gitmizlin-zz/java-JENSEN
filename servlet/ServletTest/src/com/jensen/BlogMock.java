package com.jensen;

import java.util.ArrayList;

public class BlogMock {
	
	private ArrayList<BlogPage> blogList = new ArrayList<BlogPage>();
	
	public BlogMock() {
		addToList();
	}
	
	public void addToList() {
		
		blogList.add(new BlogPage(1, "2013-12-01", "Thomas Vles", 
				"Why do cats love cardboard boxes","They can sleep absolutely anywhere", 
				"https://poopycat.com/why-do-cats-love-cardboard-boxes/"));
		
		blogList.add(new BlogPage(2, "2016-10-31", "Rick Passenier", 
				"Cats in Gibli movies","Cats have always impressed us", 
				"https://poopycat.com/cats-in-ghibli-movies/"));
		
		blogList.add(new BlogPage(3, "2015-12-25", "Kelly Marcus", 
				"Misao the Big Mama and Fukumaru the Cat","A picture says more than a thousand words", 
				"https://poopycat.com/the-story-of-a-granny-and-her-beloved-cat/"));
	}
	
	public ArrayList<BlogPage> getList() {
		return blogList;
	}
}