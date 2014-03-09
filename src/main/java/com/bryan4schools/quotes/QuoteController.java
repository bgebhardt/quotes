package com.bryan4schools.quotes;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bryan4schools.quotes.dao.Quote;
import com.bryan4schools.quotes.service.MemQuoteServiceImpl;
import com.bryan4schools.quotes.service.QuoteService;

@Controller
@RequestMapping(value = "/quotes")
public class QuoteController {

	private QuoteService quotes = null;

	// TODO change this to dependency injection
	public QuoteController() {
		quotes = new MemQuoteServiceImpl();
		seedData();
	}

	// TODO remove
	// private static final String template = "Hello, %s!";
	// private final AtomicLong counter = new AtomicLong();
	//
	// @RequestMapping("/quotes")
	// public @ResponseBody Quote quotes(
	// @RequestParam(value="name", required=false, defaultValue="World") String
	// name) {
	// return new Quote(counter.incrementAndGet(),
	// String.format(template, name));
	// }

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody
	List<Quote> list(@RequestParam(value = "id", required = false) Long id) {

		// todo: take optional id field on query string
		return quotes.getQuotes();
	}

	@RequestMapping(value = "/{quoteId}", method = RequestMethod.GET)
	@ResponseBody
	public Quote read(@PathVariable(value = "quoteId") Long id) {

		return quotes.getQuote(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public Quote create(@RequestBody Quote quote) {

		quotes.addQuote(quote);
		return quotes.getQuote(quote.getId());
	}

	@RequestMapping(value = "/{quoteId}", method = RequestMethod.PUT)
	@ResponseBody
	public Quote update(@PathVariable(value = "quoteId") Long id,
			@RequestBody Quote quote) {

		quotes.updateQuote(quote);
		return quotes.getQuote(quote.getId());
	}

	@RequestMapping(value = "/{quoteId}", method = RequestMethod.DELETE)
	@ResponseBody
	public Quote delete(@PathVariable(value = "quoteId") Long id,
			@RequestBody Quote quote) {

		Quote q = quotes.getQuote(id);
		quotes.deleteQuote(id);
		return q;
	}

	// TODO: remove. temp for testing.
	// some test quotes
	Quote q1 = new Quote(1, "Now is the time for all good men...");
	Quote q2 = new Quote(2, "The quick brown fox jumped over the lazy dog.");
	Quote q3 = new Quote(3, "May you live in interesting times.");

	// add some seed data for testing.
	public void seedData() {
		// add some quotes
		quotes.addQuote(q1);
		quotes.addQuote(q2);
		quotes.addQuote(q3);
	}

}
