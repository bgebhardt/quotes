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

Store as text file to start with
Play with Redis and other stores

Use Redis to store
Can model categories as a set with a key on the quote id 

Redis "schema"

key quote:<id>

set quote:<id>:tags
set quote:<id>:categories



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


