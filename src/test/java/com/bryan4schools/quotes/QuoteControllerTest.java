package com.bryan4schools.quotes;

import org.testng.annotations.Test;

public class QuoteControllerTest {

  @Test
  public void quotes() {
	  String text = "test";
	  QuoteController qc = new QuoteController();
		// Quote q = qc.quotes(text);
		// Assert.assertTrue(q.getContent().contains(text));
  }
}
