package abstractinterface.learningclasses

abstract class Cycle{
    abstract var noWheels :Int
    abstract val name : String
    fun move() {
        println("$name moving on $noWheels wheels")
    }
}