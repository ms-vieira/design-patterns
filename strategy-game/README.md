# strategy-game
- Context, que tem seu "comportamento" ou parte dele
definido pelo algoritmo implementado por uma
Strategy;

- Strategy, que define a interface comum para todos os
comportamentos;

- ConcreteStrategy, que implementa o comportamento
definido pela interface Strategy.

#Exemplo Implementado
Diferentes personagens de um jogo que exibem
diferentes ações e comportamentos.
- Os personagens A e B implementam o mesmo
ataque (forte). Mas os personagens C e D
implementam outro tipo de ataque (fraco).
- Além disto, os personagens A e C implementam o
mesmo tipo de movimentação (rápido), e os
personagens B e D possuem movimentação
normal.
- Neste caso, só herança não resolve, pois seria
necessário replicar a mesma forma de
ataque/movimentação.
