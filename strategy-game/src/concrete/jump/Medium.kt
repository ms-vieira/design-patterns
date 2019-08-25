package concrete.jump

import strategy.JumpStrategy

class Medium : JumpStrategy() {
    override fun jump(): Int = 20

}