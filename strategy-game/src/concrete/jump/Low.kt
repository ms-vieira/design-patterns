package concrete.jump

import strategy.JumpStrategy

class Low : JumpStrategy() {
    override fun jump(): Int = 10
}