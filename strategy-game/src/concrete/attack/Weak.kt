package concrete.attack

import strategy.AttackStrategy

class Weak : AttackStrategy() {
    override fun attack(): Int = 10
}