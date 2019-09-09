class SilverState(val account : Account) : State {

    fun setLimits() {
        this.inferiorLimit = 0.0
        this.upperLimit = 1000.00
    }

    fun withdraw(val amount: Double) {
        account.balance = (account.balance - amount - 5.0)
        checkStateChange()
    }

    fun checkStateChange() {
        when {
            account.balance < this.inferiorLimit -> account.state(StateRed(account))
            else -> account.state(StateGold(account))
        }
    }
}