package context

import strategy.AttackStrategy
import strategy.JumpStrategy
import strategy.RunStrategy

abstract class Character(
    private val attack: AttackStrategy,
    private val jump: JumpStrategy,
    private val run: RunStrategy
) {

    fun attack() { attack.attack() }

    fun jump() { jump.jump() }

    fun run() { run.run() }

}

