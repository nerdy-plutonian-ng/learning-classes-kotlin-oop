package abstractinterface.learningclasses
import GreyColor

 class Bicycle() : Cycle(), Actions, CycleColor by GreyColor {
     override val name: String = "Bicycle"
     override var noWheels: Int = 2
     //not correct math, just for serve the purpose
     override fun findTopSpeed() : Double = (1/noWheels) * 100.0

}

