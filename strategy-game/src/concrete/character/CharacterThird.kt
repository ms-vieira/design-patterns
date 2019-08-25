package concrete.character

import concrete.attack.Medium
import concrete.attack.Strong
import concrete.jump.High
import concrete.jump.Low
import concrete.run.Fast
import context.Character
import strategy.AttackStrategy
import strategy.JumpStrategy
import strategy.RunStrategy

class CharacterThird(attack: AttackStrategy, jump: JumpStrategy, run: RunStrategy) :
    Character(
    attack = attack,
    jump = jump,
    run = run

) {
    var jump: Low = Low()
    var run: Fast = Fast()
    var attack: Strong = Strong()

    init {
        this.attack = attack as Strong
        this.jump = jump as Low
        this.run = run as Fast
    }
}