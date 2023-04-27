## ***1: Mostre duas maneiras de declarar um array unidimensional de 12 doubles.***
> `double[] exercises = new double[12];>` 
> `double exercises[] = new double[12];`
> `double[] exercises = { 1.0 .. 12.0 };`

---
## ***2: Mostre como inicializar um array unidimensional de inteiros com valores de 1 a 5.***
> `int[] exercises = { 1,2,3,4,5 }`

---
## ***3: Escreva um programa que usa um array para encontrar a média de 10 valor double. Use os 10 valores que quiser.***
> No arquivo `exercises/5_3/Doubles.java`

---
## ***4: Altere a classificação da seção 5.1 do Try This e classifique um array de strings.***
> No arquivo `exercises/5_4/StringSorter.java`

---
## ***5: Qual é a diferença entre os métodos `indexOf()` e `lastIndexOf()` de `String`?*** 
> `indexOf()` retorna o indice da da primeira ocorrência da string passada e `lastIndexOf()` retorna o último indíce da String.

---
## ***6: Expandindo a classe de codificação `Encode`, modifique a para que use uma string de oito caracteres.*** 
> No arquivo `exercises/5_6/Encode.java`

---
## ***7: Já que todas as strings são objetos do tipo `String`, mostre como chamar os métodos `lenght()` e `charAt()` neste literal "I Love Java".***
> `String example = new String("I Love Java");`
> `example.length() = [[ 11 ]]`
> `example.charAt(0) = [[ I ]]`

---
## ***8: Os operadores bitwise podem ser aplicados ao tipo `double`?*** 
> Não. Double, float e boolean não funcionam com bitwise.

---
## ***9: Mostre como a sequência seguinte pode ser reescrita com o operador `?`:***  
### `if(x < 0) = 10;`
### `else y = 20;`
> `y = x < 0 ? 10 : 20`

---
## ***10: No fragmento a seguir, `&` é um operador bitwise ou lógico? Porquê?*** 
### `boolean a, b;`
### `if (a & b);`
> Lógico. Bitwise não atua em valores booleanos.
> 
---
## ***11: É um erro ultrapassar o fim de um array? E indexar um array com um número negativo?*** 
>> Sim, `ArrayIndexOutOfBoundsException` para ambos os casos.

---
## ***12: Qual é o operador de deslocamento para a direita sem sinal?*** 
> `>>>`

---
## ***13: Reescreva a `class MinMax` mostrada anteriormente para que use um laço `for` de estilo for-each.*** 
> No arquivo `exercises/5_13/MinMaxV2.java`

---
## ***14: Os laços `for` que executam as classificações na `class Bubble` podem ser convertidos em estilo for-each? Porquê?***
> Não, esses são laços for hibridos onde a variavel de controle é manipulada a fim de reordenar a posição os itens dentro do array.

---
## ***15: Um `String` pode controlar uma instrução `Switch`?*** 
> Sim, a partir do Java 7 a string passou a controlar o laço do tipo switch.