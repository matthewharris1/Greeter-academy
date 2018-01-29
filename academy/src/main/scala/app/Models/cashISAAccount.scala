package app.Models

/**
  * Created by digital032676 on 29/01/18.
  */
class cashISAAccount(accountNumber: String, balance: Double, private val depositThreshold: Double = 200) extends bankAccount(accountNumber, balance) {

  override def deposit(amount: Double) = if (amount > depositThreshold) {
    val difference = amount - depositThreshold
    println(s"You cant deposit more than $depositThreshold, Excess: $difference")
    new cashISAAccount(accountNumber, balance + depositThreshold)
  } else {
    new cashISAAccount(accountNumber, balance + amount)
  }

  override def withdraw(amount: Double) = {
    println("You cant withdraw")
    this
  }
}
