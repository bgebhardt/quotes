package com.bryan4schools.quotes.dao;

import java.util.Date;


//	"id" : "123" // unique quote identifier
//	"quote" : "May you live in interesting times."
//	"attribution" : "Chinese Curse" // who said the quote
//	"date_added" : "unknown" // unknown or a date time
//	"comment" : "From Mr. Hofmann???s World History class, 1990." // why I added the quote


public class Quote {
    
	private long id;
    private String content;
    private String attribution;
    private Date date_added;
    private String comment;
    
    
    
	public Quote(long id, String content, String attribution, Date date_added,
			String comment) {
		super();
		this.id = id;
		this.content = content;
		this.attribution = attribution;
		this.date_added = date_added;
		this.comment = comment;
	}

	public Quote(long id, String content) {
		super();
		this.id = id;
		this.content = content;
		this.attribution = "";
		this.date_added = new Date();
		this.comment = "";
	}

	public Quote(Quote q) {
		super();
		this.id = q.getId();
		this.content = q.getContent();
		this.attribution = q.getAttribution();
		this.date_added = q.getDate_added();
		this.comment = q.getComment();
	}

	
	public long getId() {
		return id;
	}

	public long getIdObject() {
		return new Long(id);
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAttribution() {
		return attribution;
	}
	public void setAttribution(String attribution) {
		this.attribution = attribution;
	}
	public Date getDate_added() {
		return date_added;
	}
	public void setDate_added(Date date_added) {
		this.date_added = date_added;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

}
