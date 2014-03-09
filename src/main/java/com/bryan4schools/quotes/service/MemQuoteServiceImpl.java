package com.bryan4schools.quotes.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bryan4schools.quotes.dao.Quote;

// TODO rename to memory quote service and move test data to unit tests.  Add helper "loader" function to load it in as a hack.

// Mock Quote service for testing the API.
public class MemQuoteServiceImpl implements QuoteService {

	private Map<Long, Quote> quotes = null;
		
	public MemQuoteServiceImpl() {
		quotes = new HashMap<Long, Quote>();		
	}
	
	@Override
	public void addQuote(Quote quote) {
		if (!quotes.containsKey(quote.getIdObject())) {
			quotes.put(quote.getIdObject(), quote);	
		}
		else {
			throw new IllegalArgumentException("Quote " + quote.getId()
					+ " already exists.  Can not add it.");
		}
	}

	@Override
	public void updateQuote(Quote quote) {
		if (quotes.containsKey(quote.getIdObject())) {
			quotes.put(quote.getIdObject(), quote);
		} else {
			throw new IllegalArgumentException("Quote " + quote.getId()
					+ " does not exist.  Can not update it.");
		}
	}

	@Override
	public Quote getQuote(long id) {
		return quotes.get(new Long(id));
	}

	@Override
	public void deleteQuote(long id) {
		// TODO can you remove a non-existing quote?
		quotes.remove(id);
	}

	@Override
	public List<Quote> getQuotes() {
		return new ArrayList<Quote>(quotes.values());
	}

}
