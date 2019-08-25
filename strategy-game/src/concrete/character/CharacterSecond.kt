package concrete.character

import concrete.attack.Medium
import concrete.attack.Strong
import concrete.jump.High
import concrete.run.Fast
import context.Character
import strategy.AttackStrategy
import strategy.JumpStrategy
import strategy.RunStrategy

class CharacterSecond(attack: AttackStrategy, jump: JumpStrategy, run: RunStrategy) :
    Character(
    attack = attack,
    jump = jump,
    run = run

) {
    var jump: High = High()
    var run: Fast = Fast()
    var attack: Medium = Medium()

    init {
        this.attack = attack as Medium
        this.jump = jump as High
        this.run = run as Fast
    }
}