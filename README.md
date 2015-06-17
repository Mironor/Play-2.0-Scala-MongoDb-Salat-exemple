**Updated for play 2.4.0**
Added test specs


First steps with Playframework 2.2.1 (Scala) and MongoDb (Salat)
--------------------------------------------------
To-do application that uses MongoDb instead of Anorm

We will use Salat library for MongoDb (https://github.com/novus/salat). There is an alternative "mongo-jackson-mapper" module for Play 2  which can be found here http://vznet.github.com/mongo-jackson-mapper , but it's somehow harder to use and it's not Scala specific, more about differences can be found here https://groups.google.com/d/msg/play-framework/K7IrXyXvL8w/SElGiQ5kPaEJ   

Steps
-----

* Don't forget to start mongodb daemon! It should use the default host (localhost) and the default port.

* Run the application (execute 'sbt run' in project's root), if everything works, congratulations, you've done it!

What next?
----------

You may want to check a MongoDB Salat plugin for Play Framework 2 (Scala only) that can be found here https://github.com/leon/play-salat 
