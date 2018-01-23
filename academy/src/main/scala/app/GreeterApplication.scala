package app

import scala.io.StdIn
/**
  * Created by digital032676 on 22/01/18.
  */

class Person(name: String, age: Int) {

  def greet() : Unit = {
    if (name == "Matthew") {
      println(s"Hello Matthew, you are $age years old")
    } else {
      println(s"Hello $name I don't know how old you are")
    }
  }
}

object Prompt {

  def name(message: String) : String= StdIn.readLine(message)

  def age() = StdIn.readLine().toInt

}
object GreeterApplication extends App {

    val name = {
      Prompt.name("What is your name? ")
      Prompt.age().toString
    }


    val Matt = new Person(name, 21)

    println(Matt.greet())

}
