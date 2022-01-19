import abstractinterface.learningclasses.Bicycle
import abstractinterface.learningclasses.CycleColor
import abstractinterface.learningclasses.Tricycle
import inheritance.learningclasses.Ball
import inheritance.learningclasses.BasketBall
import inheritance.learningclasses.GolfBall
import person.learningclasses.Person

object GreyColor : CycleColor {
    override val color: String
        get() = "grey"
}

object BlueColor : CycleColor {
    override val color: String
        get() = "blue"
}

object RedColor : CycleColor {
    override val color: String
        get() = "red"
}

fun main() {
    println(Person(name = "John",age = 45))
    val ball = Ball(20.0)
    println("Volume of ball is = ${ball.volume}")
    ball.bounce()
    val basketBall = BasketBall(radius = 24.2);
    val golfBall = GolfBall(radius = 2.13);
    basketBall.printVolume()
    basketBall.bounce()
    golfBall.printVolume()
    golfBall.bounce()
    val bicycle = Bicycle()
    val tricycle = Tricycle(bikeColor = RedColor)
    println("${bicycle.name} has ${bicycle.noWheels} wheels and is ${bicycle.color}")
    println("${tricycle.name} has ${tricycle.noWheels} wheels and is ${tricycle.color}")
}