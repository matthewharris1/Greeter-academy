package app.Models

/**
* Created by digital032676 on 29/01/18.
*/
class Person(name: String, age: Int, private val bankAccount: bankAccount) {

  def this(name: String, age: Int) = this(name: String, age: Int, new savingsAccount("123", 0.00))

  def this(name: String) = this(name: String, age = 0, new savingsAccount("123", 50.00))

  private val years: String = if (age == 1) "year" else "years"

  def greet(): Unit = {
    if (name == "Matthew") {
      println(s"Jog on Matthew you are $age $years old.")
    } else {
      println(s"Hello $name, you are $age $years old. \n You have account $bankAccount")
    }
  }
}
