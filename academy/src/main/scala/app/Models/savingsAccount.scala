package app.Models

/**
  * Created by digital032676 on 29/01/18.
  */
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
