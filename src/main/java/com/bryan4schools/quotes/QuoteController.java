package com.bryan4schools.quotes;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bryan4schools.quotes.dao.Quote;

@Controller
public class QuoteController {

	    private static final String template = "Hello, %s!";
	    private final AtomicLong counter = new AtomicLong();

	    @RequestMapping("/quotes")
	    public @ResponseBody Quote quotes(
	            @RequestParam(value="name", required=false, defaultValue="World") String name) {
	        return new Quote(counter.incrementAndGet(),
	                            String.format(template, name));
	    }
}
