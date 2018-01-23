package app

import scala.io.StdIn
/**
  * Created by digital032676 on 22/01/18.
  */

class Person(name: String, age: Int) {

  private val years : String = if(age == 1) "year" else "years"

  def greet() : Unit = {
    if (name == "Matthew") {
      println(s"Jog on Matthew you are $age $years old.")
    } else {
      println(s"Hello $name, you are $age $years old")
    }
  }
}

object Prompt {

  def name(message: String) : String= StdIn.readLine(message)
  def age(m: String) = StdIn.readLine(m).toInt

}
object GreeterApplication extends App {

    val name = Prompt.name("What is your name? ")
    val age = Prompt.age("What is your age? ")


    val Matt = new Person(name, age)

    println(Matt.greet())

}
