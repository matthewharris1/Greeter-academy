package app

import app.Models.{Person, cashISAAccount, savingsAccount}

import scala.io.StdIn

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
      val ISAdeposited = ISAaccount.deposit(1000.00)
      val ISAwithdraw = ISAaccount.withdraw(250.00)
      val personWithCashISA = new Person("Loyal Person", 54, ISAwithdraw)

      println(personWithCashISA)
      println(SavingsAccount.balance)
      println(savingPlus100.balance)
      val David = new Person("David")
      println(David)
    }