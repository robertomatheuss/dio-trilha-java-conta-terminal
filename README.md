# Sistema de Conta Bancária

Este é um simples sistema em Java para criar uma conta bancária e exibir algumas informações básicas sobre ela. Essa projeto é uma atividade da plataforma DIO

##  ContaTerminal.java

Este arquivo contém o programa principal que solicita ao usuário informações sobre a conta bancária, como nome, agência, número e saldo. Ele então cria uma instância da classe `Conta` com essas informações.

## Arquivo 2: Conta.java

Este arquivo define a classe `Conta`, que representa uma conta bancária. Ele possui quatro atributos: `numero`, `agencia`, `nome` e `saldo`. Além disso, inclui um construtor que inicializa esses atributos com os valores fornecidos e exibe uma mensagem de boas-vindas ao criar uma nova conta. Também inclui métodos para acessar esses atributos.

### Métodos da classe `Conta`:

- `getAgencia()`: Retorna a agência da conta.
- `getNome()`: Retorna o nome associado à conta.
- `getNumero()`: Retorna o número da conta.
- `getSaldo()`: Retorna o saldo atual da conta.

## Como usar

1. Compile ambos os arquivos Java.
2. Execute o programa principal, `ContaTerminal`, que solicitará as informações necessárias para criar uma nova conta bancária.
3. O programa exibirá uma mensagem de boas-vindas com os detalhes da conta recém-criada.

### Requisitos

- Java Development Kit (JDK) instalado no seu sistema.
