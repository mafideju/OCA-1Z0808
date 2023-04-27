## ***1: Usando o código da seção try-this 8-1, insira a interface `ICharQ` e suas três implementações em um pacote chamdo `qpack`. Mantendo a `Main` no pacote padrão, mostre como importar e usar as classes de `qpack`.***
### `try-this/8-1_InterfacedQueue/Main.java`


---
## ***2: O que é `namespace`? Porque é importante que java permita que vc divida em `namespace`?***
### `Um espaço de nomes é uma região declarativa. Você evita colisão de nomes.`
### `Namespace permite que defina pacotes e possa encapsular nelhor as classes. Arquivos dentro de um diretório formam um namespace em Java.`


---
## ***3: Os pacotes são armazenados em _________***
### `diretórios que formam o namespace`


---
## ***4: Explique a diferença entre `protected` e acesso padrão.***
### `Acesso padrão é o acesso que o diretorio herda do Java cuja visibilidade encerra-se dentro deste diretorio, exceto se declarado como public.`
### `Protected tem um escopo similar ao padrão, porém as subclasses de suas classes terão acesso aos membros protected, o que não ocorre no acesso padrão.`

---
## ***5: Explique as duas maneiras pelas quais os membros de um pacote podem ser usados por outro pacote.***
### `Precisa de acesso publico na classe emissora e fully qualified name, alem de precisa ser importado na classe chamadora.`


---
## ***6: Uma interface, vários métodos. Que recurso o exemplifica melhor?***
### `Polimorfismo.`


---
## ***7: Quantas classes podem implementar um interface. Quantas interfaces uma classe pode implementar?***
### `A interface poderá ser implementada por quantas classes se fizerem necessário.`
### `Uma classe pode implementar quantas interfaces forem necessárias.`


---
## ***8: As interfaces podem ser extendidas?***
### `Sim, de forma similar as classes, com uso da palavra extends.`


---
## ***9: Crie uma interface para a classe Veículo do capitulo 7. IVehicle.***
### `try-this/7-1_Vehicle/Main.java`


---
## ***10: As variaveis declaradas em uma interface são implicitamente static e final. Elas podem ser compartilhadas?***
### `Teoricamente sim, constantes nomeada, uma espécie de Enum com valores. `


---
## ***11: Um pacote é, basicamente, um conteiner para classes. V ou F?***
### `V`


---
## ***12: Que pacote padrão do java é importado automaticamente para um programa?***
### `pacote java.lang`


---
## ***13: Que palavra chave é usada para declarar o método padrão de uma interface?***
### `default`


---
## ***14: É possível definir um método static em uma interface?***
### `Sim, a partir do JDK 8`


---
## ***15: Adicionar um método `reset()` para `ICharQ` da questão 1. Resete a fila.***
### `N\A (pegadinha)`


---
## ***16: Como o método static de uma interface é chamado?***
### `através do acesso direto Interface.metodo`

