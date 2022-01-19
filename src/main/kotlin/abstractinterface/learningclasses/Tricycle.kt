package abstractinterface.learningclasses

import BlueColor

class Tricycle(bikeColor : CycleColor = BlueColor) : Cycle() , Actions, CycleColor by bikeColor {
    override var noWheels: Int = 3
    override val name: String = "Tricycle"
    //not correct math, just for serving the purpose
    override fun findTopSpeed() : Double = (1/noWheels) * 100.0
}