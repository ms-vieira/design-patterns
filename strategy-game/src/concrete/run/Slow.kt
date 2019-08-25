package concrete.run

import strategy.RunStrategy

class Slow : RunStrategy() {
    override fun run(): Int = 10
}