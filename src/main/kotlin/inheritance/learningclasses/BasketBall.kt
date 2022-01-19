package inheritance.learningclasses

class BasketBall(radius: Double) : Ball(radius = radius) {
    override val bouncability: String = "very high"
}