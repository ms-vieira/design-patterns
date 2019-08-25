package concrete.attack

import strategy.AttackStrategy

class Strong : AttackStrategy() {
    override fun attack(): Int = 30
}