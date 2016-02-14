package example

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.HttpResponse
import akka.stream.ActorMaterializer

object Boot extends App {
  implicit val system = ActorSystem()
  implicit val materializer = ActorMaterializer()
  Http().bindAndHandleSync(req => HttpResponse(entity = "Hello World!"), interface = "127.0.0.1", port = 8080)
}
