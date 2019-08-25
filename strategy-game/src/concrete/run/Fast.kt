package concrete.run

import strategy.RunStrategy

class Fast : RunStrategy() {
    override fun run(): Int = 30
}