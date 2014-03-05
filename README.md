# Important Quotes project

Bryan Gebhardt

This is a small project that I'm using to play with different web technologies.

# Project goals

1. Learn spring rest services
  1. use Spring Boot Actuator - http://spring.io/guides/gs/actuator-service/
1. Post a project to Github
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
	"quote" : "May you live in interesting times."
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

http://openmymind.net/2011/3/28/The-Little-MongoDB-Book/

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
http://blog.mongodb.org/post/59757486344/faceted-search-with-mongodb

http://www.elasticsearch.org/
http://joelabrahamsson.com/elasticsearch-101/
http://www.elasticsearch.org/tutorials/


http://www.elasticsearch.org/tutorials/using-elasticsearch-for-logs/
http://logstash.net/docs/1.3.3/tutorials/getting-started-simple

http://lucene.apache.org/solr/
