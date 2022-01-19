package inheritance.learningclasses

import kotlin.math.PI
import kotlin.math.pow

open class Ball(val radius : Double,) {

    open val bouncability : String = "moderately"
    val volume : Double
    get() = (4/3)* PI * radius.pow(3)

    fun bounce(){
        println("Ball bounced $bouncability")
    }

    fun printVolume(){
        println("Volume of ball is = $volume")
    }
}