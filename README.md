This repository will contain source code and preparation instructions for the [akka-http tutorial at BOBkonf 2016](http://bobkonf.de/2016/rudolph.html).

I'm looking forward to meet you!

If you are going to attend please run the following preparation instructions before the tutorial so that we can dive
right into the topic.

## Preparations

If you have sbt already installed:

 * clone this repository (`git clone git@github.com:jrudolph/akka-http-workshop.git`)
 * run `sbt`
 * run `~ reStart` in the sbt shell
 * browse to http://127.0.0.1:8080 and check if the server sends a response
 * getting to know the API will be easiest with an IDE
   * if you use already use a Java IDE, import the project into your IDE
   * otherwise, install IntelliJ (download from https://www.jetbrains.com/idea/download/) and then import the project
   * using a text editor will work as well, in this case, I'd recommend to download the [complete akka distribution](http://downloads.typesafe.com/akka/akka_2.11-2.4.2.zip)
     so that you have the complete API docs on your local machine
 * edit the response text in Boot.scala, this should trigger an automatic recompile and restart of the server, try
   http://127.0.0.1:8080 again to see if the change was applied

If you don't have sbt already installed:

 * if you don't have a recent Java version installed, download and install [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
 * clone this repository (`git clone git@github.com:jrudolph/akka-http-workshop.git`)
 * run `./sbt` or `sbt.bat` from this directory, this will download about 50MB and will take several minutes
 * run `~ reStart` in the sbt shell
  * browse to http://127.0.0.1:8080 and check if the server sends a response
  * getting to know the API will be easiest with an IDE
    * if you use already use a Java IDE, import the project into your IDE
    * otherwise, install IntelliJ (download from https://www.jetbrains.com/idea/download/) and then import the project
    * using a text editor will work as well, in this case, I'd recommend to download the [complete akka distribution](http://downloads.typesafe.com/akka/akka_2.11-2.4.2.zip)
      so that you have the complete API docs on your local machine
  * edit the response text in Boot.scala, this should trigger an automatic recompile and restart of the server, try
    http://127.0.0.1:8080 again to see if the change was applied

If you have troubles, please open an issue on this repository! See you on Friday :)