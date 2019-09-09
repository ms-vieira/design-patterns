data class Account(private val state: State(StateSilver)
private val number: String
private val balance: Double)
{
    fun deposit(val amount: Double) {
        state.deposit(amount)
        println("Deposito --- $amount")
        println("Saldo --- $balance")
        println("State $state")
    }

    fun withdraw(val amount: Double) {
        state.withdraw(amount)
        println("Saque--- $amount")
        println("Saldo--- $balance")
        println("State $state")
    }

}


