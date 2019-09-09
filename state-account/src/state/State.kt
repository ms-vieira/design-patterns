abstract class State(
        val account : Account = account.setLimits()) {

    private val account: Account
    private val inferiorLimit: Double
    private val upperLimit: Double

    protected abstract fun setLimits()

    fun deposit(val amount: Double) {
        account.balance = (account.balance + amount)
        checkStateChange()
    }

    fun withdraw(val amount: Double) {
        account.balance = (account.balance - amount)
        checkStateChange()
    }

    protected abstract checkStateChange()
}