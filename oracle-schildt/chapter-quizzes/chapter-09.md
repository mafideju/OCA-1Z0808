## ***1: Que classe fica no topo da heirarquia de exceções?***
### `Throwable é a classe mãe das exceções e erros. A classe Exception está abaixo de Throwable e e principal classe de exceção lançada.`


---
## ***2: Explique resumidamente como try e catch são usados.***
### `São dois blocos predefinidos pela linguagem Java. O bloco try executa uma parte do código. Se não houver nenhum erro,o código é executado e segue seu fluxo normal. Caso haja alguma anomalia, alguma exceção, o fluxo do código é direcionado para o bloco catch onde as exceções devem ser tratados pelo programador e não serem pegas pela JVM, assim evitando o interrupmento abrupto do programa.`


---
## ***3: O que está errado neste fragmento:***
> `vals[18] = 10;`
> `catch(Exception e) trata erro`
### `Ausencia do bloco try antes do catch.` 

---
## ***4: O que acontece quando uma exceção não é capturada?***
### `Quando não for capturada e tratada pelo programador será capturada pela JVM que retornará um erro interrompendo o fluxo do programa.`


---
## ***5: O que está errado no fragmento seguinte:***
> `class A extends Exception {`
> `class B extends class A {`
> `try { ... } catch (A exc) catch (B exc)`
### `A primeira exceção deve ser a mais especifica, o catch B deve estar antes do catch A para funcionar de forma correta`


---
## ***6: Um catch interno pode lançar exceção para um catch externo?***
### `Sim, try catchs podem ser aninhados.`


---
## ***7: O bloco finally é a ultima parte do codigo executada. Verdadeiro ou falso? Explique sua resposta.***
### `Apenas quando o bloco try é executado. Quando o fluxo entra no catch, o finally não é executado.`


---
## ***8: Que tipo de exceções devem ser declarado na cláusula thorws de um metodo***
### `Todas, exceto Runtime e Error.`


---
## ***9: O que está errado neste fragmento?***
> `class MyClass { ... }`
> `throw new MyClass();`
### `MyClass não pode ser lançada como erro, ela precisa estender Throwable | Exception`


---
## ***10: Adicionar erro ao projeto Stack.***
### ``


---
## ***11: Quais as três maneiras pela qual uma exceção pode ser gerada?***
### `Erro interno do JVM, Exceções padrão com try/catch, Exceções manuais com uso de throws.`


---
## ***12: Quais são as duas subclasses diretas de Throwable?***
### `Exception e Error`


---
## ***13: O que é um recurso multi-catch?***
### `Lançar mais de uma exceção em uma única clausula catch, atráves do | operator.`


---
## ***14: Normalmente, um código deve capturar as exceções do tipo Error?***
### `Não. Erros são capturados pela JVM e não temos controle sobre eles, apenas sobre as exceções.`

