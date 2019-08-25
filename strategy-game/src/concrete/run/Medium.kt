package concrete.run

import strategy.RunStrategy

class Medium : RunStrategy() {
    override fun run(): Int = 20
}