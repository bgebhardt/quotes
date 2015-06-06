# Important Quotes project

Bryan Gebhardt

This is a small project that I'm using to play with different web technologies.

# Project goals

1. Learn spring rest services
  1. use Spring Boot Actuator - http://spring.io/guides/gs/actuator-service/
1. Post a project to Github
1. Play with TestNG testing framework
1. Learn a storage tech - Redis or MongoDB or Elastic Search?


# Requirements

1. CRUD operations on quote
1. Search for quote
1. Service interface to CRUD operations
1. Return a random quote
2. Commenting system for quotes
2. Categorization system for quotes

# API Design

/api/quotes/{id}

{
	"id" : "123" // unique quote identifier
	"quoteNumber" : // the quote number based on when it was added to the list.  Automatically max + 1 if not specified.
QUESTION: Do I make id and quote number the same?  Tempted to for simpliticy.  Means id is a smart business key.
	"quote" : "May you live in interesting times."  // QUESTION: should I support markdown or HTML?
	"attribution" : "Chinese Curse" // who said the quote
	"date_added" : "unknown" // unknown or a date time
	"comment" : "From Mr. Hofmann’s World History class, 1990." // why I added the quote
}

/api/quotes/

list of quote objects


/api/quotes?search="blah"

{

}

/api/quotes/random  // get a random quote; use for quote of the day or similar.

# Design

NEW 04-25-2015 

* elastic search for quotes
* write an angularJS app to interact with elastic search directly
	* Use bootstrap to make it look nice
* use logstash to ETL and batch load quotes


---

Store as text file to start with
Play with Redis and other stores

Use Redis to store
Can model categories as a set with a key on the quote id 

Redis "schema"

key quote:<id>

set quote:<id>:tags
set quote:<id>:categories


## Logstash set up to load in quotes

On a mac install via brew

	% brew install logstash

TODO: update logstash config file

Run logstash with the logstash config

	% logstash -f logstash-quotes.conf

### useful logstash links

[Grok Debugger](http://grokdebug.herokuapp.com/)

[Little Logstash Lessons - Part I: Using grok and mutate to type your data | Elastic](https://www.elastic.co/blog/little-logstash-lessons-part-using-grok-mutate-type-data)
[match logstash correct date format - Stack Overflow](http://stackoverflow.com/questions/23222128/match-logstash-correct-date-format)
[elasticsearch - Logstash: How to use date/time in a filename as an imported field - Stack Overflow](http://stackoverflow.com/questions/28277045/logstash-how-to-use-date-time-in-a-filename-as-an-imported-field)
[grok - Logstash custom date log format match - Stack Overflow](http://stackoverflow.com/questions/26035136/logstash-custom-date-log-format-match)
[Elasticsearch: The Definitive Guide](http://www.elastic.co/guide/en/elasticsearch/guide/current/index.html)
[‎www.geocities.jp/kosako3/oniguruma/doc/RE.txt](http://www.geocities.jp/kosako3/oniguruma/doc/RE.txt)
[date](http://www.elastic.co/guide/en/logstash/current/plugins-filters-date.html)
[grok](http://www.elastic.co/guide/en/logstash/current/plugins-filters-grok.html)
[logstash-patterns-core/grok-patterns at master · logstash-plugins/logstash-patterns-core](https://github.com/logstash-plugins/logstash-patterns-core/blob/master/patterns/grok-patterns)
[elasticsearch](http://www.elastic.co/guide/en/logstash/current/plugins-outputs-elasticsearch.html#plugins-outputs-elasticsearch-index)
[file](http://www.elastic.co/guide/en/logstash/current/plugins-inputs-file.html#plugins-inputs-file-sincedb_path)

[Logstash Multiline Tomcat and Apache Log Parsing – Michael Lanyon's Blog](http://blog.lanyonm.org/articles/2014/01/12/logstash-multiline-tomcat-log-parsing.html)
[logstash - open source log management](http://logstash.net/docs/1.4.0/filters/grok)
[logstash - open source log management](http://www.logstash.net/docs/1.1.12/tutorials/10-minute-walkthrough/)
[Logstash: 0-60 in 60 | Elastic](https://www.elastic.co/webinars/logstash-0-60-in-60?baymax=rtp&elektra=downloads&iesrc=ctr)
[Using Logstash to import CSV Files Into ElasticSearch](https://kevinkirsche.com/2014/08/25/using-logstash-to-import-csv-files-into-elasticsearch/)
[A simple Logstash conffile with a custom grok filter](https://gist.github.com/juanje/3081998)


# Useful Spring Info


## Spring Boot and Actuator info
https://spring.io/guides/gs/spring-boot/
http://spring.io/guides/gs/actuator-service/
https://github.com/spring-projects/spring-boot/blob/master/spring-boot/README.md
https://github.com/spring-projects/spring-boot/blob/master/spring-boot-actuator/docs/Features.md

## other Spring tutorials

http://spring.io/guides/gs/messaging-redis/
https://github.com/xetorthio/jedis
https://github.com/xetorthio/jedis/wiki
http://redis.io/documentation
http://pauladamsmith.com/articles/redis-under-the-hood.html
http://my.safaribooksonline.com/book/databases/9781449311353/redis-cookbook/id2971634?reader=html&imagepage=

http://spring.io/guides/gs/accessing-data-mongodb/
http://spring.io/guides/gs/relational-data-access/

http://wiki.fasterxml.com/JacksonHome

http://www.manning.com/walls5/SiA4E_MEAP_ch1.pdf
http://www.manning.com/walls5/
http://www.dzone.com/tutorials/java/spring/spring-mvc-tutorial-1.html
http://webcache.googleusercontent.com/search?q=cache:7l6xG5NWro4J:spring.io/guides/gs/actuator-service/+&cd=1&hl=en&ct=clnk&gl=us
http://spring.io/guides
http://projects.spring.io/spring-boot/


## Redis links
http://redis.io/topics/twitter-clone
http://openmymind.net/2011/3/28/The-Little-MongoDB-Book/
http://openmymind.net/2011/7/5/Rethink-your-Data-Model/
http://openmymind.net/2011/5/8/Practical-NoSQL-Solving-a-Real-Problem-w-Mongo-Red/
http://openmymind.net/2011/11/8/Redis-Zero-To-Master-In-30-Minutes-Part-2/
http://openmymind.net/2011/11/8/Redis-Zero-To-Master-In-30-Minutes-Part-1/
http://redis.io/commands
http://redis.io/topics/quickstart
http://redis.io/topics/data-types-intro

### Redis searching
http://www.dr-josiah.com/2010/07/building-search-engine-using-redis-and.html
https://www.npmjs.org/package/redis-search

### Redis autocompletion
http://engineering.getglue.com/post/36667374830/autocomplete-search-with-redis
http://oldblog.antirez.com/post/autocomplete-with-redis.html    https://gist.github.com/antirez/574044
http://patshaughnessy.net/2011/11/29/two-ways-of-using-redis-to-build-a-nosql-autocomplete-search-index
https://www.npmjs.org/package/redis-autocompleter

Soulmate - Ruby/Redis autocompletion gem https://github.com/seatgeek/soulmate
https://www.npmjs.org/package/redis-autocompleter

## Mongodb search
http://openmymind.net/2011/3/28/The-Little-MongoDB-Book/

http://blog.mongodb.org/post/59757486344/faceted-search-with-mongodb

http://www.elasticsearch.org/
http://joelabrahamsson.com/elasticsearch-101/
http://www.elasticsearch.org/tutorials/


http://www.elasticsearch.org/tutorials/using-elasticsearch-for-logs/
http://logstash.net/docs/1.3.3/tutorials/getting-started-simple

http://lucene.apache.org/solr/

## Testing and mocking related links

http://testng.org/doc/eclipse.html
http://www.particlewave.com/2013/05/16/spring-unit-testing-using-junit/
http://www.particlewave.com/2013/07/04/using-testng-with-spring/
http://www.mkyong.com/unittest/testng-spring-integration-example/
https://github.com/bgebhardt/quotes
http://www.javatechtipssharedbygaurav.com/2013/04/rest-web-service-with-crud-operations.html
http://azagorneanu.blogspot.com/2011/09/crud-restful-services-using-spring.html
http://www.javacodegeeks.com/2013/04/spring-mvc-hibernate-maven-crud-operations-example.html
http://steveperkins.net/use-spring-boot-next-project/
http://samerabdelkafi.wordpress.com/2013/07/01/junit-test-with-mockito-and-spring/
https://code.google.com/p/mockito/
http://gualtierotesta.wordpress.com/2013/10/03/tutorial-using-mockito/


