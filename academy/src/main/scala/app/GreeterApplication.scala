package app

import scala.io.StdIn
/**
  * Created by digital032676 on 22/01/18.
  */
object GreeterApplication extends App {

 def greet(name: String): Unit = {
   if (name == "Matthew") {
     println("Hello Matthew")
    } else {
     println(s"Hello $name")
   }
 }

 val name = StdIn.readLine("What is your name? ")

  greet(name)
}