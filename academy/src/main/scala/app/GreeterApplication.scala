package app

import scala.io.StdIn
/**
  * Created by digital032676 on 22/01/18.
  */

abstract class bankAccount(accountNumber: String, val balance: Double) {

  def withdraw(amount: Double): bankAccount

  def deposit(amount: Double): bankAccount
}

class savingsAccount(accountNumber: String, balance: Double) extends bankAccount(accountNumber, balance) {

  override def withdraw(amount: Double): bankAccount = {
    if ((balance - amount) < 0) {
      println(s"You have insufficient funds")
      this
    } else {
      val deducted = balance - amount
        println(s"Balance after deductions: $deducted")
      new savingsAccount(accountNumber, deducted)
    }
  }

  override def deposit(amount: Double): bankAccount = {
    new savingsAccount(accountNumber, balance + amount)
  }
}

class cashISAAccount(accountNumber: String, balance: Double) extends bankAccount(accountNumber, balance) {

  override def deposit(amount: Double) = new cashISAAccount(accountNumber, balance + amount)

  override def withdraw(amount: Double) = {
    println("You cant withdraw")
    this
  }
}
    class Person(name: String, age: Int) {

      private val years: String = if (age == 1) "year" else "years"

      def greet(): Unit = {
        if (name == "Matthew") {
          println(s"Jog on Matthew you are $age $years old.")
        } else {
          println(s"Hello $name, you are $age $years old")
        }
      }
    }

    object Prompt {

      def name(message: String): String = StdIn.readLine(message)

      def age(m: String) = StdIn.readLine(m).toInt

    }
    object GreeterApplication extends App {

      val name = Prompt.name("What is your name? ")
      val age = Prompt.age("What is your age? ")

      val Matt = new Person(name, age)

      println(Matt.greet())

      val SavingsAccount = new savingsAccount("12345", 99)
      val savingPlus100 = SavingsAccount.withdraw(100.00)

      val ISAaccount = new cashISAAccount("54321", 50.00)
      val ISAPlus100 = ISAaccount.deposit(100.00)

      println(SavingsAccount.balance)
      println(savingPlus100.balance)
    }