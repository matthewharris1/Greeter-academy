package app.Models

/**
  * Created by digital032676 on 22/01/18.
  */

abstract class bankAccount(accountNumber: String, val balance: Double) {

  def withdraw(amount: Double): bankAccount

  def deposit(amount: Double): bankAccount

  override def toString: String = s"Account number: $accountNumber balance $balance"
}
