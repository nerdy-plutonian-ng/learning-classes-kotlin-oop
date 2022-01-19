package inheritance.learningclasses

class GolfBall(radius : Double) : Ball(radius = radius) {
    override val bouncability: String = "poorly"
}