package com.bryan4schools.quotes.service;

import java.util.List;

import com.bryan4schools.quotes.dao.Quote;

public interface QuoteService {

	public void addQuote(Quote quote);
	
	public void updateQuote(Quote quote);
	
	public Quote getQuote(long id);
	
	public void deleteQuote(long id);
	
	public List<Quote> getQuotes();
		
}
