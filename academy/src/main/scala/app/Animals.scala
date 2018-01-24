package app

abstract class Animals(name: String) {

  def speak()

}

class Dog (name: String) extends Animals (name){

  override def speak() = println(s"My name is $name Woof")

}
class Cat (name: String) extends Animals (name) {

  override def speak() = println(s"My name is $name Meow")

}
class Puma (name: String, Speed: Int) extends Cat (name) {

  override def speak() = println(s"My name is $name Prr")

  def speed() = println (s"I can run $Speed km fast")
}
class Elephant (name: String, size: Int) extends Animals (name) {

  override def speak() = println(s"My name is $name uuuuuuuuuuuuuhrhhuuhhh. $Size")

  private val Size = if (size >= 25) "I am definitely tall enough to be an elephant" else "Nah bro that animal to small"


}
class Wolf (name: String) extends Dog (name) {

  override def speak() = println(s"My name is $name Howl")
}
class Hound (name: String) extends Dog (name) {

  override def speak() = println(s"My name is $name WOOOOOOF BITCH")

  def Hunt() = println("I hunt rats for my own enjoyment")
}
class Meowth (name: String, coins: Int, teamrocket: Boolean) extends Cat (name) {

  override def speak() = println(s"$name THATS RIGHT! You have $coins $coin. $teamRocket")

//  def coin() = println(s"You have $coins coins")

  private val teamRocket = if (coins >= 10) "Yo i've got enough coins to be part of team rocket" else "Yo im just a normal pokemon"

  private val coin = if (coins == 1) "coin" else "coins"
}
class Bird (name: String, fly: Boolean) extends Animals (name) {

  override def speak() = println(s"Hi I am $name I am a bird $canFly")

  private val canFly = if (true) "Weyaye I can fly" else "Aw naw I can't fly"
}
class Pidgey (name: String, fly: Boolean) extends Bird (name, fly) {

}



object MyAnimals extends App  {
  val jess: Animals = new Cat("Lassie")
  val Lassie: Animals = new Dog("Jess")
  val Dan: Puma = new Puma("Dan", 24)
  val Nelly: Elephant = new Elephant("Nelly", 26)
  val Ghost: Wolf = new Wolf("Ghost")
  val Houndoom: Hound = new Hound("Houndoom")
  val Meowth: Meowth = new Meowth("Meowth", 9, true)
  val Pidgey: Pidgey = new Pidgey("Pidgey", true)

  println(jess.speak())
  println(Lassie.speak())
  println(Dan.speak())
  println(Dan.speed())
  println(Nelly.speak())
  println(Ghost.speak())
  println(Houndoom.Hunt())
  println(Meowth.speak())
  println(Pidgey.speak())
}
