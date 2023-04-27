## ***1: Dado o seguinte fragmento `class X { private int = count; }`, podemos afirmar se o seguinte está correto: `Class Y {  public static void main(String... args) { X ob = new X(); ob.count = 10 } `***
### `Não está correto. Como a propriedade count está declarada como privada em sua classe, ela não pode ser acessada diretamente de outra classe. 

---
## ***2: Um modificador de acesso deve _______ a declaração de um membro.***
### `Preceder`

---
## ***3: O complemento de uma fila é e pilha. Ela usa o acesso primeiro a entrar e último a sair como uma pilha de pratos. O primeiro prato colocado na mesa é o ultimo a ser usado. Crie uma classe de pilha chamada `Stack` que possa conter caracteres. Chame os metodos que acessa a pilha de `push()` e `pop()`. Permita que o usuario especifique o tamanho da pilha quando ela for criada. Mantenha os membros privados.***
### `exercises/6_3/Stack.java`

---
## ***4: Dada a classe abaixo, crie um metodo chamado `Swap()` que troque o conteudo dos objetos referenciados por duas referencias do objeto `Test`.***
>> `Class Test { int a; Test(int a) { a = i; }; }`
### `exercises/6_4/ClassTest.java`

---
## ***5: O fragmento a seguir está correto?***
>> `Class X { int meth(int a, int b) { ... }; String meth(int a, int b) { ... }}`
### `Está errado. No overload os parametros devem ser de tipo e/ou quantidade diferentes. O tipo de retorno não influencia na sobrecarga do método.`

---
## ***6: Crie um método recursivo que exiba o conteudo de uma string de tras pra frente.***
### `exercises/6_6/StringRecursion.java`

---
## ***7: Se todos os objetos de uma classe tiverem que compartilhar a mesma variável, como você deve declarar esta variável?***
> `Como static`

---
## ***8: Porque você pode ter de usar o bloco `static`?***
> `Para iniciar um bloco que será compartilhado por todos os objetos`

---
## ***9: O que é uma classe interna?***
> `Uma classe aninhada a outra, sendo declarada dentro dela`

---
## ***10: Para que um membro só possa ser acessado por outros membros de sua classe, que modificador de acesso deve ser usado?***
> `Private`

---
## ***11: O nome de um método mais sua lista de parametros compõem a _______ do método***
### `Assinatura`

---
## ***12: Um argumento `int` é passado para um método com o uso da chamada por _______***
> `valor`

---
## ***13: Crie um método `varargs` chamado `sun()` que some os valores int passados para ele. Faça retornar um resultado. Demonstre seu uso.***
### `exercises/6_13/SunVarargs.java`

---
## ***14: Um método varargs pode ser sobrecarregado?***
> `Sim, mas com numero variaveis de argumentos, sendo varargs sendo sempre o último a ser passado. Apenas o varargs com outro tipo não é permitido`

---
## ***15: Mostre um exemplo de um método varargs sobrecarregado que seja ambíguo.***
> `void metodo1(String... varargs) | void metodo1(boolean... varargs)`
