# Data

The data directory contains initial quote data to load into elastic search.

## Logstash set up to load in quotes

On a mac install via brew

	% brew install logstash

TODO: update logstash config file

Run logstash with the logstash config

	% logstash -f logstash-quotes.conf
