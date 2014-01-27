Updated for play 2.2.1
Added test specs


First steps with Playframework 2.2.1 (Scala) and MongoDb (Salat)
--------------------------------------------------

Follow the official tutorial about how to create a todo application using Play 2.2.1 framework with Scala: http://www.playframework.com/documentation/2.2.x/ScalaTodoList

It uses an Sql database (Anorm) and we will try to use MongoDb instead.

We will use Salat library for MongoDb (https://github.com/novus/salat). There is an alternative "mongo-jackson-mapper" module for Play 2  which can be found here http://vznet.github.com/mongo-jackson-mapper , but it's somehow harder to use and it's not Scala specific, more about differences can be found here https://groups.google.com/d/msg/play-framework/K7IrXyXvL8w/SElGiQ5kPaEJ   

Steps
-----

* Complete the official todo tutorial.

* Replace build.sbt and project/plugins.sbt files with the ones from this repo.

* Execute "play dependencies" in the project's root folder.

* Replace other files in your application by ones from this repo (test/ folder is optional).

* Don't forget to start mongodb daemon! It should use the default host (localhost) and the default port.

* Run the application, if everything works, congratulations, you've done it!

What next?
----------

You may want to check a MongoDB Salat plugin for Play Framework 2 (Scala only) that can be found here https://github.com/leon/play-salat 
