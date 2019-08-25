package concrete.jump

import strategy.JumpStrategy

class High : JumpStrategy() {
    override fun jump(): Int = 30
}