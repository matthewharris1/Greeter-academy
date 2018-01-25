package app

import java.util.Optional

class Point (val x: Int, val y: Int) {

  override def toString: String = s"Current position: $x, $y"

}

abstract class Resource (amount: Int)

class Mana (amount: Int) extends Resource (amount)
class Rage (amount: Int) extends Resource (amount)
class Gold (amount: Int) extends Resource (amount)

abstract class Alliance (health: Int, resource: Resource, var cPos: Point) {

  def move(pos: Point)= {
    val diffX = Math.abs(pos.x - cPos.x)
    val diffY = Math.abs(pos.y - cPos.y)

    if ((diffX <=  1) && (diffY <= 1)) {
      cPos = pos
      cPos
    } else {
      println(s"You can't move this much")
    }
  }

  def attack(): String
}
class Mage (health: Int, resource: Mana, sPos: Point) extends Alliance (health, resource, sPos) {

  override def attack() = "I cast a spell"
}
class Cleric (health: Int, resource: Mana, sPos: Point) extends Alliance (health, resource, sPos) {

  override def attack() = "I cast a heal spell"
}
class Warrior (health: Int, resource: Rage, sPos: Point) extends Alliance (health, resource, sPos) {

  override def attack() = "I do a melee attack"

  override def move(pos: Point)= {
    val diffX = Math.abs(pos.x - cPos.x)
    val diffY = pos.y - cPos.y

    if ((diffX <= 5) || (diffY <= 1)) {
      println("You can only charge along 5 slots!")
    } else {
      cPos = pos
      cPos
    }
  }
}
class Paladin (health: Int, resource: Mana, sPos: Point) extends Alliance (health, resource, sPos) {

  override def attack() = "I cast a damaging Spell "

  def heal() = "I heal for 50 health"
}
abstract class Horde (health: Int, resource: Gold, sPos: Point) extends Alliance (health, resource, sPos) {

}
class DemonDog (health: Int, resource: Gold, sPos: Point) extends Horde (health, resource, sPos) {
  override def attack() = "Bite"
}
class NightborneElf (health: Int, resource: Gold,sPos: Point) extends Horde (health, resource, sPos) {

  override def attack() = "I cast void bolt"

  override def move(pos: Point)= {
    val diffX = Math.abs(pos.x - cPos.x)
    val diffY = Math.abs(pos.y - cPos.y)

    if ((diffX <= 3) & (diffY <= 3)) {
      cPos = pos
      cPos
    } else {
      println("You can only Teleport 3 spaces up or down")
    }
  }
}
class Orc (health: Int, resource: Gold, sPos: Point) extends Horde (health, resource, sPos) {

  override def attack() = "Swings Sword"
}
class LesserDemon (health: Int, resource: Gold, sPos: Point) extends Horde (health, resource, sPos) {

  override def attack() = "Consume Soul"
}



object Hero extends App {
  val Michael = new Mage(100, new Mana(175), new Point(1, 1))
  val John = new Cleric(80, new Mana(200), new Point(1, 3))
  val Connor = new Warrior(150, new Rage(75), new Point(2, 2))
  val Josh = new Paladin(125, new Mana(130), new Point(4, 4))

  val Pan = new DemonDog(120, new Gold(160), new Point (10, 1))
  val Jack = new Orc(240, new Gold(200), new Point(10, 3))
  val Doug= new NightborneElf(100, new Gold(120), new Point(9, 2))
  val Shannon = new LesserDemon(400, new Gold(510), new Point (5, 5))

  println(Michael.attack())
  println(John.attack())
  println(Pan.move(new Point(Pan.cPos.x + -1, Pan.cPos.y + 0)))
  println(Pan.cPos)
  println(Pan.move(new Point(Pan.cPos.x + 2, Pan.cPos.y + 2)))
  println(Doug.move(new Point(Doug.cPos.x + 2,Doug.cPos.y + 3)))
  println(Shannon.attack())

}
