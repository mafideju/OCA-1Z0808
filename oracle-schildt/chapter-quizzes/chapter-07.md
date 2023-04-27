## ***1: Uma superclasse tem acesso aos membros de uma subclasse? E uma subclasse, pode acessar os membros de uma superclasse?***
### `Não, o pai não conhece os membros do filho. A subclasse tem acesso direto aos membros não privados da superclasse.`


---
## ***2: Crie uma subclasse de TwoDShape chamada Circle. Inclua um método `area()` que calcule a área de um circulo e um construtor que usa `super` para inicializar a parte referente a `TwoDShape`.***
### `exercises/7_2/Circle.java`


---
## ***3: Como impedir que uma subclasse tenha acesso aos membros de uma superclasse?***
### `Declarando seus métodos como privados`


---
## ***4: Descreva a finalidade e a aplicação das duas versões de `super` mostradas neste capitulo?***
### `Super pode chamar o método do pai de forma direta, `super.metodo;`. Também pode ser usado para chamar e receber os atributos do construtor do pai `super(a, b)`


---
## ***5: Dada a hierarquia a seguir, qual a ordem em que os contrutores são chamados quando Gamma é instanciada?***
>### `class Alpha { ...`
>### `class Beta extends Alpha { ...`
>### `class Gamma extends Beta { ...`
### `construtor Alpha, construtor Beta, construtor Gamma`


---
## ***6: Uma referência da superclasse pode referenciar um objeto da subclasse. Explique porque isso é importante na sobreposição de métodos.***
### `O ultimo método a ser chamado será o executado em runtime.. Esse método estará em uma subclasse sobrescrevendo o método da classe pai.`


---
## ***7: O que é uma classe abstrata?***
### `Contém ao menos um método abstrato. Uma classe que traz implementações básicas a serem aplicadas nas classes que precisam. Pode conter apenas a assinatura a ser implementada (metodo abstrato).`


---
## ***8: Como impedir que um método seja sobreposto? E que uma classe seja herdada?***
### `Declarando o método como final. O mesmo para a classe. Final`


---
## ***9: Explique como a herança, a sobreposição de métodos e as classe abstratas são usadas para dar suporte ao polimorfismo.***
### `Criação de classes base que podem ser aproveitadas por outras classes. Classe abstrata = uma interface, varios metodos.`


---
## ***10: Que classe é superclasse de todas as classes?***
### `A classe Objeto é a classe a que todas as outras classes são extendidas por padrão.`


---
## ***11: Uma classe que contém pelo menos um método abstrato deve ser declarada como abstrata. Falso ou verdadeiro?***
### `Verdadeiramente True`


---
## ***12: Que palavra chave é usada para criar uma constante nomeada?***
### `final`
