package example

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.HttpResponse
import akka.stream.ActorMaterializer

import scala.util.{Failure, Success}

object Step0 extends App {
  implicit val system = ActorSystem()
  import system.dispatcher
  implicit val materializer = ActorMaterializer()

  val binding =
    Http().bindAndHandleSync({
      request => HttpResponse(entity = "Hello World!")
    }, interface = "127.0.0.1", port = 8080)

  binding
    .onComplete {
      case Success(Http.ServerBinding(local)) => println(s"Server bound successfully to $local")
      case Failure(error) =>
        println("Error during server start")
        error.printStackTrace()
    }
}
