package app

import scala.io.StdIn

/**
  * Created by digital032676 on 23/01/18.
  */

abstract class AbstractPerson (firstName: String,lastName: String, _age: Int) {

  def fullName: String = s"$firstName $lastName"

  def age: String = s"You are $age years old"

  val studying : Boolean
}

class Student(firstName: String, lastName: String, age : Int) extends AbstractPerson(firstName, lastName, age) {


  override val studying: Boolean = true

  override def fullName: String = {

    s"${super.fullName} welcome to the class."
  }


}
class Worker (firstName: String, lastName: String, age: Int) extends AbstractPerson(firstName, lastName, age) {

  override val studying: Boolean = false

  override def fullName: String = {

    s"${super.fullName} Welcome to the company."
  }


}

object Prompt1 {

  def firstName(message: String): String = StdIn.readLine(message)

  def lastName(message: String): String = StdIn.readLine(message)

  def age(m: String) = StdIn.readLine(m).toInt
}




object StudentApp extends App {

  val firstName = Prompt1.firstName("What is your name? ")
  val lastName = Prompt1.lastName("What is your lastName? ")
  val age = Prompt1.age("How old are you? ")

  val Matty = new Student(firstName, lastName, age)
  val Daniel = new Worker(firstName, lastName, age)


  println(Daniel.fullName)
}
