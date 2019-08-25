package concrete.attack

import strategy.AttackStrategy

class Medium : AttackStrategy() {
    override fun attack(): Int = 20
}