package app

import scala.io.StdIn
/**
  * Created by digital032676 on 22/01/18.
  */
object GreeterApplication extends App {

 def greet(name: String, age: Int): Unit = {
   if (name == "Matthew") {
     println(s"Hello Matthew, you are $age years old")
    } else {
     println(s"Hello $name I don't know how old you are")
   }
 }

 val name = StdIn.readLine("What is your name? ")
  val age = 21

  greet(name, age)
}
