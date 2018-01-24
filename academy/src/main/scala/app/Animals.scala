package app

abstract class Animals(name: String) {

  def speak()

}

class Dog (name: String) extends Animals (name){

  override def speak() = println(s"My name is $name")

}

class Cat (name: String) extends Animals (name) {

  override def speak() = println(s"My name is $name")

}
class Puma (name: String, Speed: Int) extends Cat (name) {

  override def speak() = println(s"My name is $name")

  def speed() = println (s"I can run $Speed km fast")
}

object MyAnimals extends App  {
  val jess: Animals = new Cat("Lassie")
  val Lassie: Animals = new Dog("Jess")
  val Dan: Puma = new Puma("Dan", 24)

  println(jess.speak())
  println(Lassie.speak())
  println(Dan.speak())
  println(Dan.speed())

}
