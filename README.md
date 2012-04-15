First steps with Playframework 2.0 (Scala) and MongoDb (Salat)
--------------------------------------------------

In the official wiki there is a tutorial about how to create a todo
application using Play 2.0 framework with Scala, you can find it here http://www.playframework.org/documentation/2.0/ScalaTodoList 

But it uses an Sql database.

We will try to make it use MongoDb instead.

We will use Salat library for MongoDb support (https://github.com/novus/salat). There is also an alternative "mongo-jackson-mapper" module for Play 2.0  which can be found here http://vznet.github.com/mongo-jackson-mapper , but it's somehow harder to use and it's not Scala specific, more about differences can be found here https://groups.google.com/d/msg/play-framework/K7IrXyXvL8w/SElGiQ5kPaEJ   

Steps
-----

* Complete the tutorial mentioned before if you didn't already do that.

* Replace project/Build.scala file by the one from this repo.

* Do "play dependencies" in your console (in the project's root folder)

* Replace other files in your application by files from this repo.

* Don't forget to start mongodb daemon! It should use the default host (localhost) and the default port.

* Run the application, if everything works, congratulations, you've done it!

* Have fun!

What next?
----------

I tried to keep this tutorial as simple as possible, there is, obviously, much more things to do if you want to create a large-scale application.

First of all there is a problem with ClassCastExceptions, as *tmbo* said:

```
If the application grows, you will run into ClassCastExceptions if you don't use our own salat-context
(it's because of plays dynamic class reloading and stuff). The context should look like https://github.com/andypetrella/classloading-problem/blob/master/app/models/salatctx.scala
```

There is also a MongoDB Salat plugin for Play Framework 2 (Scala only) with an example application (address book) that is much more complete than my "First-step tutorial", it can be found here https://github.com/leon/play-salat 
