package concrete.character

import concrete.attack.Strong
import concrete.jump.Medium
import context.Character
import strategy.AttackStrategy
import strategy.JumpStrategy
import strategy.RunStrategy

class CharacterFirst(attack: AttackStrategy, jump: JumpStrategy, run: RunStrategy) :
    Character(
    attack = attack,
    jump = jump,
    run = run

) {
    var jump: concrete.jump.Medium = concrete.jump.Medium()
    var run: concrete.run.Medium = concrete.run.Medium()
    var attack: Strong = Strong()

    init {
        this.attack = attack as Strong
        this.jump = jump as Medium
        this.run = run as concrete.run.Medium
    }
}