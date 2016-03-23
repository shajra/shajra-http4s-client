package shajra.extn.http4s


import org.http4s.UriFunctions
import scalaz.concurrent.Task
import scalaz.EitherT


package object client extends RequestFunctions with UriFunctions {

  type ClientAction[A] = EitherT[Task, ClientFault, A]

}
