# Palavras Reservadas

São identificadores de uma linguagem que já possuem uma finalidade específica. A linguagem Java possui 52 palavras reservadas.

## Controle de Pacotes

- ``import``: importa pacotes ou classes para dentro do código.
- ``package``: especifica a que pacote todas as classes de um arquivo pertencem.

## Modificadores de Acesso

- ``public``: acesso de qualquer classe.
- ``´private``: acessp apenas dentro da classe.
- ``protected``: acesso por classes no mesmo pacote e subclasses.

## Tipos Primitivos

- ``boolean``: true ou false.
- ``byte``: um inteiro de 8 bits (signed).
- ``char``: um caractér unicode (16-bit unsigned)
- ``double``: um número de ponto flutuante de 64 bits (signed)
- ``float``: um número de ponto flutuante de 32 bits (signed)
- ``int``: um inteiro de 32 bits (signed)
- ``long``: um inteiro de 64 bits (signed)
- ``short``: um inteiro de 32 bits (signed)
- ``void``: indica que o método não tem retorno de valor.

## Modificadores de Classes, Variáveis ou Métodos

- ``abstract``: classe que não pode ser instanciada ou método que precisa ser implementado por uma subclasse não abstrata.
- ``class``: declara uma classe.
- ``extends``: indica a superclasse que a subclasse está extendendo.
- ``final``: impossibilita que uma classe seja estendida, que um método seja sobrescrito ou que uma variável seja reinicializada.
- ``implements``: indica as interfaces que a classe irá implementar
- ``native``: indica que um método está escrito em uma linguagem dependente de plataforma, como o C.
- ``new``: criar um novo objeto, chamando seu construtor.
- ``static``: faz um método ou variável pertencer à classe ao invés de às instâncias.
- ``strictfp``: usado em frente a um método ou classe para indicar que os números de ponto flutuante seguirão as regras de ponto flutuante em todas as expressões.
- ``synchronized``: indica que um método só pode ser acessado por uma thread de cada vez.
- ``transient``: impede a serialização de campos.
``volatile``> indica que uma variável pode ser alterada durante o uso de threads.

## Controle de Fluxo Dentro do Bloco de Código

- ``break``: sai do bloco de código em que ele está.
- ``case``: executa um bloco de código dependendo do teste do ``switch``.
- ``continue``: pula a execução do código que viria após essa linha e vai para a próxima passagem do loop.]

## Tabela de Usos

| Uso | Palavras |
|--------|-----------------|
| Arquivo | ``package, import, static`` |
| Classe | ``public, protect, private + final, abstract + extends, implements`` |
| Método | ``public, protected, private + static, final, abstract + void, return`` |
| Atributo | ``public, protected, private + static, final, abstract + tipo primitivo`` |

## Palavras Opostas

São palavras que representam oposição uma à outra, ou seja, não se pode usar uma se estiver usando a outra.

| Palavra | x | Palavra |
|---------|---|---------|
| ``package`` | x | ``import`` |
| ``extends`` | x | ``implements`` |
| ``final`` | x | ``abstract`` |
| ``throws`` | x | ``throw`` |
