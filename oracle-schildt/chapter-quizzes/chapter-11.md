## ***1: Como o uso de várias threads permita java escrever programas mais eficientes?***
### `Threads podem ser abertas para execução de processos concomitantes como impressão, abertura ou fechamento de arquivos, através da divisão dos recursos de processamento.`


---
## ***2: O uso de várias threads é suportado pela classe _______ e pela interface _______.***
### `Classe Thread, Interface Runnable.`


---
## ***3: Na criação de um objeto executável, porque pode ser melhor estender `Thread` do que implementar `Runnable`?***
### `Thread tem todos os métodos de concorrencia, Runnable só run(). Thread, enquanto classe, tem acesso ao um construtor que pode ser usado para iniciar a Thread assim que ela for criada, sendo que este recurso não tem na interface.`


---
## ***4: Mostre como podemos usar `join()` para esperar um objeto de thread chamado `MyThread` terminar***
### `Thread myThread = new Thread();`
### `myThread.start();`
### `myThread.join();`


---
## ***5: Mostre como configurar uma thread chamada MyThread com 3 niveis acima da prioridade normal.***
### `myThread.setPriority(Thread.NORM_PRIORITY + 3)`


---
## ***6: Qual o efeito da inclusão da palavra chave `syncronized` em um método?***
### `Esse método passa pelo monitor do objeto. Assim, ele só poderá ser chamado quando não estiver sendo usado (não retornar) por outra thread. Esse método não será usado em dois lugares ao mesmo tempo.`


---
## ***7: Os métodos `wait()` e `notify()` são usados na execução da _______.***
### `Comunicação entre threads.`


---
## ***8: Altere a classe TicToc para que ela marque tempo de verdade.***
### `try-this/11-1_TicToc`


---
## ***9: Porque você na pode usar `resume()`, `suspend()` e `stop()` em programas mais novos?***
### `Porque são recursos antigos da linguagem Java e já foram descontinuados.`


---
## ***10:Que método definido por `Thread` obtem o nome de uma thread?***
### `currentThread().getName();`


---
## ***11: O que `isAlive()` retorna?***
### `true or false`


---
## ***12: Tente adicionar sincronização à classe `Queue`.***
### ``
