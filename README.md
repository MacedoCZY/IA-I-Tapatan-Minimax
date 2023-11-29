# Inteligencia Artificial

### Descrição
Projeto desenvolvido para matéria de Inteligencia Artificial, implementação do jogo Tapatan utilizando o método de Minimax, usando Java.

## Modelo de Tela
![Urubu do Pix](https://github.com/MacedoCZY/IA-I-Tapatan-Minimax/blob/main/Tela.PNG)

### Especificações
O código principal se encontra no projeto IA2.\
O método de verificação de ganhador é feito via matriz de reccorência.\
||||||||||
|-|-|-|-|-|-|-|-|-|
|0|1|0|1|1|0|0|0|0|
|1|0|1|0|1|0|0|0|0|
|0|1|0|0|1|1|0|0|0|
|1|0|0|0|1|0|1|0|0|
|1|1|1|1|0|1|1|1|1|
|0|0|1|0|1|0|0|0|1|
|0|0|0|1|1|0|0|1|0|
|0|0|0|0|1|0|1|0|1|
|0|0|0|0|1|1|0|1|0|

Todas as possibilidades de jogada da máquina são geradas a partir de uma árvore.\
Cada nó da árvore contém:
```java
public int[][] Tab;
public Node pai;
public int Profundidade = 0;
public List<Node> filho = new ArrayList<>();
```
