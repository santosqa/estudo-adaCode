# Supermarket Array Application

Esta aplicação é um exemplo simples de gerenciamento de um supermercado utilizando um array fixo para armazenar itens. Ela permite adicionar, visualizar e excluir itens do array. A implementação inclui uma interface `Supermarket` e uma classe concreta `SupermarketArray`, além de uma classe principal `Main` para interação com o usuário.

## Estrutura do Projeto

O projeto é composto pelos seguintes arquivos:

1. **Main.java**: Classe principal que contém o método `main` e a interface de interação com o usuário.
2. **Supermarket.java**: Interface que define os métodos para manipulação dos itens no supermercado.
3. **SupermarketArray.java**: Implementação da interface `Supermarket` utilizando um array para armazenar os itens.

### Main.java

A classe principal `Main` contém o método `main`, que exibe um menu interativo para o usuário. As opções disponíveis são:

- Adicionar um item
- Visualizar os itens
- Excluir um item
- Sair do programa


### Supermarket.java
A interface Supermarket define os métodos que devem ser implementados pela classe SupermarketArray.

### SupermarketArray.java
A classe SupermarketArray implementa a interface Supermarket utilizando um array de strings para armazenar os itens. Ela inclui métodos para adicionar, imprimir e excluir itens.


### Como Executar
Compile todas as classes:
```sh
javac Main.java implementation/Supermarket.java implementation/SupermarketArray.java
```

Execute a aplicação:

```sh
java Main
```
## Funcionalidades
### Adicionar Item
- O usuário será solicitado a inserir o valor do item.
- O item será adicionado ao array se houver espaço disponível.
- Se o array estiver cheio, uma mensagem de erro será exibida.

### Visualizar Itens
- Exibe todos os itens atualmente armazenados no array.
- Se o array estiver vazio, uma mensagem será exibida informando que não há itens.

### Excluir Item
- O usuário será solicitado a inserir o índice do item a ser excluído.
- Se o índice for válido, o item será removido e os itens subsequentes serão deslocados.
- Se o índice for inválido, uma mensagem de erro será exibida.

### Sair
- Encerra a aplicação.


