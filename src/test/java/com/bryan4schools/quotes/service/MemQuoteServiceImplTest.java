package com.bryan4schools.quotes.service;

import java.util.List;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bryan4schools.quotes.dao.Quote;

public class MemQuoteServiceImplTest {

	QuoteService quotes = null; 
	
	// some test quotes
	Quote q1 = new Quote(1, "Now is the time for all good men...");
	Quote q2 = new Quote(2, "The quick brown fox jumped over the lazy doc.");
	Quote q3 = new Quote(3, "May you live in interesting times.");
	
	@BeforeMethod
	public void testSetup() {
		quotes = new MemQuoteServiceImpl();
	}
	
	@AfterMethod
	public void testCleanup() {
		quotes = null;
	}
	
	@Test
	public void addNewQuote() {
		// test add new quote
		quotes.addQuote(q1);
		Assert.assertEquals(q1.getContent(), quotes.getQuote(q1.getIdObject())
				.getContent());
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void addExistingQuote() {
		// test add quote
		quotes.addQuote(q1);
		Assert.assertEquals(q1.getContent(), quotes.getQuote(q1.getIdObject())
				.getContent());

		// test add existing quote
		quotes.addQuote(q1);
	}

	@Test
	public void deleteExistingQuote() {
		quotes.addQuote(q1);

		quotes.deleteQuote(1);

		Assert.assertNull(quotes.getQuote(1));
	}

	@Test
	public void deleteNonExistingQuote() {
		quotes.deleteQuote(1);

		Assert.assertNull(quotes.getQuote(1));
	}

	@Test
	public void getQuote() {
		seedData();
		
		Quote q = quotes.getQuote(1);
		Assert.assertEquals(q1.getId(), q.getId());
		Assert.assertEquals(q1.getContent(), q.getContent());
		
	}

	@Test
	public void getZeroQuotes() {
		List<Quote> l = quotes.getQuotes();
		Assert.assertEquals(0, l.size());
	}

	@Test
	public void getManyQuotes() {
		quotes.addQuote(q1);
		quotes.addQuote(q2);

		List<Quote> l = quotes.getQuotes();
		Assert.assertEquals(2, l.size());
	}


	@Test
	public void updateExistingQuote() {
		// test add new quote
		quotes.addQuote(q1);
		Assert.assertEquals(q1.getContent(), quotes.getQuote(q1.getIdObject())
				.getContent());

		Quote q = new Quote(q2);
		q.setId(q1.getId());

		quotes.updateQuote(q);
		Assert.assertEquals(q2.getContent(), quotes.getQuote(q1.getIdObject())
				.getContent());
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void udpateNewQuote() {
		// test update non-existing quote
		quotes.updateQuote(q1);
	}

	// Utility function

	// add some seed data for testing.
	public void seedData() {
		// add some quotes
		quotes.addQuote(q1);
		quotes.addQuote(q2);
		quotes.addQuote(q3);
	}
	
}
