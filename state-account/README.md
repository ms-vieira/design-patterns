# state-account
-  Context:
Define uma interface com o cliente.

- Mantém uma instância de um ConcreteState que
define o seu estado atual.

- State: define uma interface para a criação de estados
concretos.

- Concrete State: implementa o comportamento associado a um
estado particular de Context.

#Exemplo Implementado
Controle de estado de contas bancárias:
-  Se a conta estiver com saldo entre 0 e 1000 = estado prata.
Neste caso, o cliente deve pagar uma taxa por cada saque que realizar.
-  Se a conta estiver com saldo maior que 1000 = estado ouro.
Neste caso, o cliente não paga taxa de saque e ainda ganha um
rendimento imediado em cada depósito que realizar.
-  Se a conta estiver com saldo negativo = estado vermelho. Neste caso,
não é permitido a realização de saques. Apenas depósitos. 